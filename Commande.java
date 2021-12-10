import javax.management.loading.PrivateClassLoader;

import java.util.ArrayList;
public class Commande {

    public static final Commande C = new Commande();
    ArrayList<Menu> menu = new ArrayList<Menu>(); 

    private Commande(){}
    public static Commande getInstance(){return C;}    

    public String toString(){
        return "marche";
    }
}
