import java.util.ArrayList;
public class Commande {
    private int choix_menu;
    public static final Commande C = new Commande();
    ArrayList<Menu> menu = new ArrayList<Menu>(); 

    public void setchoix_menu(int choix_menu){
        this.choix_menu=choix_menu;
    }
    private Commande(){
        Menu m=new Menu(choix_menu);
        menu.add(m);
    }
    public static Commande getInstance(){return C;}    

    public String toString(){
        return "votre"+choix_menu;
    }
}
