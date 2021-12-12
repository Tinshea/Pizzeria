import java.util.ArrayList ;
public class Ingredient {
    // Attributs
    private static ArrayList <Ingredient> lstIngredients= new ArrayList<Ingredient>(); // lst de tous les ingredients choisi 
    private static double prixTotal = 6; // Prix total des ingredients choisi
    
    protected String nom; // Nom d'un ingredient choisi
    protected double prix; // Prix d'un ingredient choisi
    protected boolean estVege; // true si l'ingredient choisi est vege, false sinon. 

    // Constructeurs
    public Ingredient(String nom, double prix, boolean estVege) {
        this.nom = nom ;
        this.prix = prix;
        this.estVege = estVege;
        this.prixTotal += this.prix; 
    }
    public Ingredient() {}
    
    // Methodes :   
    // Getters et Setters
    public String getNom() { // Acceder au nom d'ingredient choisi
        return nom;
    }

    public void setNom(String nom) { // Mettre le nom d'un ingredient choisi
        this.nom = nom;
    }

    public double getPrix() { // Acceder au prix d'un ingredient choisi 
        return prix;
    }
   

    public void setPrix(float prix) { //Changer le prix d'un ingredient choisi 
        this.prix = prix;
    }

    public Ingredient getLstIngredient(int i) { // Voir tous les ingredients choisi
        return lstIngredients.get(i); 
    }
    
    // Ajouter ingredient
    public static void ajouterSupplement (Ingredient i) {
        lstIngredients.add(i); 
        prixTotal += i.getPrix();
    }
    
    public static double getPrixTotal() {return prixTotal; } // Accedes au prix total

    public int sizeLstIngredient() { // Nombre des ingredients choisi au total
        return lstIngredients.size(); 
    }
    public String estVegetarien() { // retour un texte selon si l'ingredient choisi est vegetarien ou non
        if (estVege) {
            return "Cette ingredient est vegetarien"; 
        }
        else {
            return "Cette ingredient n'est pas vegetarien";
        }
    }
    public String toString() { // toString
        if (estVege) {
            return nom + ": vegetarien, Prix : "+prix +"euros \n" ; 
        }
        else {
            return nom + ": non vegetarien, Prix : "+prix +"euros \n" ; 
        }
    }
}
