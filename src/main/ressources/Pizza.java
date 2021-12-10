package main.ressources;

public class Pizza extends Menu {
    protected double taille;
    protected double Prix;

    public Pizza(int choix_menu, double taille) {
        super(choix_menu);
        this.taille = taille;

    }

    public Pizza(int choix_menu, double taille, boolean vegetarien) {
        super(choix_menu);
        this.taille = taille;

    }
}