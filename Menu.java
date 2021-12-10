public class Menu {
    private static int num_commande;
    private int cpt=0;
    private int choix_menu;
    protected boolean commande_pret=false;
    protected boolean vegetarien=false;

    public Menu(int choix_menu){
        num_commande++;
        cpt=num_commande;
        this.choix_menu=choix_menu;
    }

    public Menu(int choix_menu,boolean vegetarien){
        num_commande++;
        cpt=num_commande;
        this.choix_menu=choix_menu;
        this.vegetarien=vegetarien;
    }

    public boolean set_commandepret(){
        this.commande_pret=true;
        return  commande_pret;
    }

    public Menu clone(){
    
        return new Menu(choix_menu);
    }

    public String toString(){
        return " Le menu "+choix_menu+"\n Vous etes vegetarien: "+vegetarien+"\n Votre numero de commande : "+cpt+"\n Votre commande est prete ?: "+commande_pret; 
    }
}