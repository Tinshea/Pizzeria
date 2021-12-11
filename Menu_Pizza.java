import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu_Pizza extends Pizza{

    static File MenuPizza= new File("MenuPizza.txt");

    public Menu_Pizza(int choix_menu,int taille,boolean vegetarien){
        super(choix_menu,taille,vegetarien);
    }

    //savoir si c'est dans le menu
    public static void inmenu(int nombre) throws NoinmenuException{
        if(nombre>18){
                throw new NoinmenuException();
            
        }
    }


     //affiche le menu
     public static void affichemenu() throws InterruptedException{
     try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(MenuPizza),"UTF-8"));
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
    

 

}
