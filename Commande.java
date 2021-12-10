public class Commande {
    private int num_commande;
    private int choix_menu;
    protected boolean commande_pret=false;
    protected boolean vegetarien=false;

    public Commande(int choix_menu){
        num_commande++;
        this.choix_menu=choix_menu;
    }

    public Commande(int choix_menu,boolean vegetarien){
        num_commande++;
        this.choix_menu=choix_menu;
        this.vegetarien=vegetarien;
    }

    public boolean set_commandepret(){
        this.commande_pret=true;
        return  commande_pret;
    }

    public String toString(){
        return " Vous avez choisie le menu "+choix_menu+"\n Vous êtes vegétarien: "+vegetarien+"\n Vous avez le numéro de commande : "+num_commande+"\n Votre commande est prête ?: "+commande_pret; 
    }
}