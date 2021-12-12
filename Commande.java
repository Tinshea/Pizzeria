import java.util.ArrayList;

public class Commande {
    private int choix_menu=0;
    private boolean vegetarien=false;
    private String Sauce="";
    private int taille=0;
    private ToutIngredient Ingredient;
    public static final Commande C = new Commande();
    private double prix_total=0;
    ArrayList<Menu> menu = new ArrayList<Menu>();
    Pizza m;


    private Commande() {
    }

    public static Commande getInstance() {
        return C;
    }
    public static void LireDoucement(String s) throws InterruptedException{
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            Thread.sleep(15);
        }
        System.out.println("\n");
       
    }
    public void addMenu(int choix_menu,int taille,boolean vegetarien) {
        this.choix_menu = choix_menu;
        this.vegetarien = vegetarien;
        this.taille=taille;
        this.m=new Menu_Pizza(choix_menu,taille , vegetarien);
        this.menu.add(this.m);
    }

    public void addCompose(int taille,boolean vegetarien,String Sauce,ToutIngredient Ingredient) {
        this.vegetarien = vegetarien;
        this.taille=taille;
        this.Sauce=Sauce;
        this.Ingredient=Ingredient;
        this.m=new Compose(taille,vegetarien,Sauce,Ingredient);
        this.menu.add(this.m);
    }
    public void addcomposition(int choix_menu,int taille,boolean vegetarien) {
        this.choix_menu = choix_menu;
        this.vegetarien = vegetarien;
        this.m=new Menu_Pizza(choix_menu,taille , vegetarien);
        this.menu.add(this.m);
    }


    public void addlememeMenu() {
        this.menu.add(m.clone());
    }

    public String toString() {
        String s = "\n |je repete votre commande, vous avez bien choisie : |\n\n";
        for (int i = 0; i < this.menu.size(); ++i) {
            s +="----------------------------------\n"+this.menu.get(i) ;
        }
        return s+"----------------------------------\n";
    }
}