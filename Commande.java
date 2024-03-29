import java.util.ArrayList;

public class Commande {
    //Class singleton 
    //attribut 
    private int choix_menu=0;
    private boolean vegetarien=false;
    private String Sauce="";
    private int taille=0;
    private Ingredient Ingredient;
    public static final Commande C = new Commande();// l'unique instance de commande 
    private static double prix_total=0;
    ArrayList<Menu> menu = new ArrayList<Menu>();
    Pizza m;

    //constructeur
    private Commande() {
    }

   
    //methode 
    //pour les lire les textes lentement
    public static void LireDoucement(String s) throws InterruptedException{
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            Thread.sleep(15);
        }
        System.out.println("\n");
       
    }
    //affiche Le menu pour les pizzas
    public void afficheMenu(boolean vegetarien) throws InterruptedException{
        this.m=new Menu_Pizza(vegetarien);
        m.affiche();
    }

     //affiche Le menu pour les Ingredients
    public void afficheIngredient() throws InterruptedException{
        this.m=new Compose();
        m.affiche();
    }

    //rajoute le Menu_pizza dans la commande 
    public void addMenu(int choix_menu,int taille,boolean vegetarien) {
        this.choix_menu = choix_menu;
        this.vegetarien = vegetarien;
        this.taille=taille;
        this.m=new Menu_Pizza(choix_menu,taille , vegetarien);
        this.menu.add(this.m);
        this.prix_total+=m.getprixdepizza();
    }

    //rajoute la pizza composé dans la commande 
    public void addCompose(int taille,boolean vegetarien,String Sauce,Ingredient Ingredient) {
        this.vegetarien = vegetarien;
        this.taille=taille;
        this.Sauce=Sauce;
        this.Ingredient=Ingredient;
        this.m=new Compose(taille,vegetarien,Sauce,Ingredient);
        this.menu.add(this.m);
        this.prix_total+=m.getprixdepizza();
    }

    //Rajoute la meme pizza que commander précédement 
    public void addlamemepizza() {
        this.menu.add(m.clone());
        this.prix_total+=m.clone().getprixdepizza();
    }

    //Pour recuperer l'unique instance de Commande
    public static Commande getInstance() {
        return C;
    }
    //methode to String 
    public String toString() {
        String s = "\n |je repete votre commande, vous avez bien choisie : |\n\n";
        for (int i = 0; i < this.menu.size(); ++i) {
            s +="----------------------------------\n"+this.menu.get(i) ;
        }
        return s+"----------------------------------\n"+"Merci de Payer un total de :"+String.format("%.2f",prix_total)+"Euros\n";
    }

}