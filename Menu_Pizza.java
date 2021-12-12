import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu_Pizza extends Pizza implements Dessert{

    //Atribut 
    private static File MenuPizza= new File("MenuPizza.txt");
    private static File MenuPizza_veg= new File("MenuPizza_veg.txt");
    private String[] Nompizza=
    {
        "Pizza Napoletana","Pizza Margherita","Pizza marinara","Calzone Pizza","Pepperoni Pizza","Caprese Pizza","New York-Style Pizza","Pizza Romana","4 Fromage ","Pizza capricciosa",
    "Sicilian Pizza","Hawaiian Pizza","Pizzette","Pizza ai funghi","Pizza al taglio","Stromboli","Pizza prosciutto","Pizza prosciutto"
    };

    private double[] PrixPizza={6.50,7,8,4.50,6,8,15,8.90,9.10,6.50,7,8,4.50,6.15,15.60,8.90,9.10,6.50};
    private String[] Nompizzaveg=
    {
    "Pizza veggie","Pizza au chèvre et au miel","Pizza à la tomme de vache et à la roquette","Pizza pizza blanche à la mozzarella","Pizzaverte, pesto et légumes grillés","Pizza 4 Fromages",
    "Pizza blanche aux cèpes","Pizza tian","Pizza tomate-mozzarella au pesto","Pizza sans gluten au chou-fleur","Pizza blanche aux artichauts poivrade et roquette","Pizza aux poires et à la fourme d'Ambert",
    "Pizza vegan aux épinards","Pizza aux légumes de l'ete","Pizza roulée aux légumes","Pizza aux tomates cerises,roquette et mozzarella","Pizza printanière","Pizza printanière","Pizza aux légumes grillés"
    };
    private double[] PrixPizzaveg={7,8,4.50,6,8,15,8.90,9.10,6.50,7,8.60,8,4.50,6.15,15.60,8.90,9.10,6.50};

    //constructeur
    public Menu_Pizza(){}
    public Menu_Pizza(boolean vegetarien){
        this.vegetarien=vegetarien;
    }

    public Menu_Pizza(int choix_menu,int taille,boolean vegetarien){ 
        super(choix_menu,taille,vegetarien);
        switch(taille){
            case 26: if(vegetarien) {super.Prix =PrixPizzaveg[choix_menu-1];}else{super.Prix =PrixPizza[choix_menu-1];} break;
            case 33: if(vegetarien) {super.Prix =2+PrixPizzaveg[choix_menu-1];}else{super.Prix =2+PrixPizza[choix_menu-1];} break; 
            case 40: if(vegetarien) {super.Prix =4+PrixPizzaveg[choix_menu-1];}else{super.Prix =4+PrixPizza[choix_menu-1];} break; 
        }
    }

    //interface :
    public String dessert(){
        return"Vous avez a un dessert surprise en plus\n";
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
        return super.Prix;
    }
    

    //Methode toString
    public String toString(){
        if(vegetarien){
        return super.toString()+"Vous avez pris "+Nompizzaveg[choix_menu-1]+"\nVous etes vegetarien: "+isVegetarien()+"\nLe prix est "+ Prix+"Euro\n"+dessert();}

        else{
            return super.toString()+"Vous avez pris "+Nompizza[choix_menu-1]+"\nVous etes vegetarien: "+isVegetarien()+"\nLe prix est "+ Prix+"Euro\n";
        }
    }
    
}
