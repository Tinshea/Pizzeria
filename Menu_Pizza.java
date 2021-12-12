import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu_Pizza extends Pizza{

    //Atribut 
    private static File MenuPizza= new File("MenuPizza.txt");
    private static File MenuPizza_veg= new File("MenuPizza_veg.txt");
    private String[] Nompizza=
    {"Pizza Napoletana","Pizza Margherita","Pizza marinara","Calzone Pizza","Pepperoni Pizza","Caprese Pizza","New York-Style Pizza","Pizza Romana","4 Fromage ","Pizza capricciosa",
    "Sicilian Pizza","Hawaiian Pizza","Pizzette","Pizza ai funghi","Pizza al taglio","Stromboli","Pizza prosciutto","Pizza prosciutto"};
    private double Prix=Math.random()*(16)+4;

    //constructeur
    public Menu_Pizza(){}
    public Menu_Pizza(boolean vegetarien){
        this.vegetarien=vegetarien;
    }

    public Menu_Pizza(int choix_menu,int taille,boolean vegetarien){
        super(choix_menu,taille,vegetarien);
    }

    
    //Methode :

    //savoir si c'est dans le menu
    public static void inmenu(int nombre) throws NoinmenuException{
        if(nombre>18){ 
            throw new NoinmenuException();
        }     
    }


     //affiche le bon menu
     public void affiche() throws InterruptedException{
            BufferedReader reader;
        try{
            if(isVegetarien()){reader = new BufferedReader(new InputStreamReader(new FileInputStream(MenuPizza_veg),"UTF-8"));}

            else{reader = new BufferedReader(new InputStreamReader(new FileInputStream(MenuPizza),"UTF-8"));}

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


    //Le clone si la personne commande la meme chose 
    public Menu_Pizza clone(){
        return new Menu_Pizza(choix_menu,taille,vegetarien);
    }

    //getteur
    public double getprixdepizza(){
        return Prix;
    }
    

    //Methode toString
    public String toString(){
        return super.toString()+"Vous avez pris "+Nompizza[choix_menu-1]+"\nVous etes vegetarien: "+isVegetarien()+"\nLe prix est "+ String.format("%.2f", Prix)+"Euro\n";
    }
    
}
