public class Pizza extends Commande {
    protected  double taille;

    public Pizza(int choix_menu,double taille){
        super(choix_menu);
        this.taille=taille;

    }

    public Pizza(int choix_menu,double taille,boolean vegetarien){
        super(choix_menu);
        this.taille=taille;

    }
}