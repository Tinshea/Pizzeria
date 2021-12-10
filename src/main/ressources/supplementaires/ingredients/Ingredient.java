package main.ressources.supplementaires.ingredients;

public class Ingredient {
    protected String nom;
    protected float prix;
    protected boolean estVege;
    public Ingredient(String nom, float prix, boolean estVege) {
        this.nom = nom ;
        this.prix = prix;
        this.estVege = estVege;
    }
    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    public String toString() {return nom + ": Vegetarien : "+estVege+" Prix : "+prix +"\n" ; }
}
