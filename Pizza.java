import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.UIDefaults.ActiveValue;

public abstract class Pizza extends Menu {
    // Attributs 
    protected  int taille;
    protected double Prix;
    private static int taillepizza;
    static Scanner scanner = new Scanner(System.in);

    static File SizePizza= new File("SizePizza.txt");

    // Constructeurs
    public Pizza(boolean vegetarien){
       super(vegetarien);
    } 

    public Pizza(){super();}

    public Pizza(int taille,boolean vegetarien) {
        super(vegetarien);
        this.taille=taille;
    }

    public Pizza(int choix_menu,int taille,boolean vegetarien){
        super(choix_menu,vegetarien);
        this.taille=taille;

    }

    //Methodes abstraits: 

    public abstract Pizza clone(); //Clonage
    public abstract void affiche() throws InterruptedException; //affichage

    //Methode :  
    //affiche le menu
    public static void affichesize() throws InterruptedException{
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(SizePizza),"UTF-8"));
            String line= reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                Thread.sleep(15);
                line=reader.readLine();
            }
            reader.close();
        }catch(IOException exp){
            System.out.println("Erreur d'ouverture");
        }
    }

    // Taille de Pizza
    public static void sizeofpizza(int size) throws NoSizeofPizzaException, InterruptedException{
        if(size == 26 || size == 33 || size == 40){
            Commande.LireDoucement("vous avez pris la taille "+size+"cm");       
        }
        else {throw new NoSizeofPizzaException();}
    }

    // Demande la Taille de la Pizza
    public static int DemandetaillePizza() throws InterruptedException{
        boolean condition=true;

        while(condition){
            Commande.LireDoucement("Quelle Taille Voulez-vous ? : (Ecrire le nombre uniquement)");
            affichesize();
            Thread.sleep(500);
            try{

                taillepizza = scanner.nextInt();
                sizeofpizza(taillepizza);
                condition=false;

            } catch(InputMismatchException e){

                Commande.LireDoucement("Vous n'avez pas rentrer un nombre valide, Veuillez reessayer !!");  
                Thread.sleep(1000);
                scanner.nextLine();}

            catch(NoSizeofPizzaException e){
                Commande.LireDoucement("Ce n'est pas une taille de Pizza !!");  
                    Thread.sleep(1000);
                    scanner.nextLine();
            }
        }
        return taillepizza;
    }
    // toString
    public String toString(){
        return super.toString()+"\nLa Taille de votre pizza est: "+taille+"cm\n";
    }

    
}