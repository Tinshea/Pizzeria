public abstract class Ingredient {
    protected String nom;
    protected double prix;
    protected boolean estVege;
    // Pour gerer stock
    protected Ingredient(String nom, double prix, boolean estVege) {
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    public String toString() {
        if (estVege) {
            return nom + ": vegetarien, Prix : "+prix +"euros \n" ; 
        }
        else {
            return nom + ": non vegetarien, Prix : "+prix +"euros \n" ; 
        }
        
    }
    public abstract void nonDisponible() ;
}
