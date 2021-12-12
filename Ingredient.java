import java.util.ArrayList ;
public class Ingredient {
    private static ArrayList <Ingredient> lstIngredients= new ArrayList<Ingredient>();
    private static double prixTotalIngredients = 0;
    
    protected String nom;
    protected double prix;
    protected boolean estVege;
    // Pour gerer stock
    public Ingredient(String nom, double prix, boolean estVege) {
        this.nom = nom ;
        this.prix = prix;
        this.estVege = estVege;
        this.prixTotalIngredients += this.prix; 
    }
    public Ingredient() {}
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
    public static void ajouterSupplement (Ingredient i) {
        lstIngredients.add(i); 
        prixTotalIngredients += i.getPrix();
    }

    public Ingredient getLstIngredient(int i) {
        return lstIngredients.get(i); 
    }

    public int sizeLstIngredient() {
        return lstIngredients.size(); 
    }
}
