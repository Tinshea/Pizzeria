import java.util.ArrayList;

public class Commande {
    private int choix_menu;
    private boolean vegetarien;
    public static final Commande C = new Commande();
    ArrayList<Menu> menu = new ArrayList<Menu>();
    Menu m;

    private Commande() {
    }

    public static Commande getInstance() {
        return C;
    }

    public void addMenu(int choix_menu, boolean vegetarien) {
        this.choix_menu = choix_menu;
        this.vegetarien = vegetarien;
        this.m=new Menu(choix_menu, vegetarien);
        this.menu.add(this.m);
    }

    public void addlememeMenu() {
        this.menu.add(this.m.clone());
    }

    public String toString() {
        String s = "je repete votre commande, vous avez bien choisie :\n";
        for (int i = 0; i < this.menu.size(); ++i) {
            s += this.menu.get(i) + "\n";
        }
        return s;
    }
}