public class Menu {
    //atribut
    private static int num_commande;
    private int cpt=0;
    protected int choix_menu;
    protected boolean vegetarien;
   
    //Constructeur 
    public Menu(){}

    public Menu(String Poubelle){}

    public Menu(boolean vegetarien){
        num_commande++;
        cpt=num_commande;
        this.vegetarien=vegetarien;
    }

    public Menu(int choix_menu,boolean vegetarien){
        num_commande++;
        cpt=num_commande;
        this.choix_menu=choix_menu;
        this.vegetarien=vegetarien;
    }


    //Getteur

    public boolean isVegetarien() {
        return vegetarien;
    }
    
    //methode toString
    public String toString(){
        return "Votre numero de Pizza : "+cpt;
    }
}