
public class Champignon extends Ingredient {
    private static int nbDansStock = 0; // Nb d'ingredient restant dans le stock
    // Constructeur 
    public Champignon() {
        super("Champignon", 0.5, true);
    }
    // Methodes : 
    public static int getNbDansStock() {return nbDansStock; }  // Acceder aux nb d'ingredient restant dans le stock
    public static void setNbDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    // Pour ne pas permettre choisir une ingredient non disponible dans le stock 
    public void nonDisponible() throws NotInStockException{
        if (nbDansStock < 0) {
            throw new NotInStockException(); 
        }
    }
}
