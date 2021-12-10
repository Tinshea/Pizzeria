import java.util.ArrayList;
public class Commande {
    private int choix_menu;
    public static final Commande C = new Commande();
    ArrayList<Menu> menu = new ArrayList<Menu>(); 
    Menu m;
   

    private Commande(){
       
    }
    public static Commande getInstance(){return C;}    

    public void addMenu(int choix_menu){
        this.choix_menu=choix_menu;
        m=new Menu(choix_menu);
        menu.add(m);}

       public void addlememeMenu(){
        menu.add(m.clone());}

    public String toString(){
        String s="je repete votre commande, vous avez bien choisie :\n";
        for(int i=0;i<menu.size();i++){
            s+=menu.get(i)+"\n";
        }
        return s;

    }
}
