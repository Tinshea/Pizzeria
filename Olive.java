public class Olive extends Ingredient {
    private static int nbDansStock = 10; // Nb d'ingredient restant dans le stock
    // Constructeur
    public Olive() {
        super("Olive",0.2, true);
        nbDansStock --;  
    }
    public static int getNbDansStock() {return nbDansStock; } // Acceder aux nb d'ingredient restant dans le stock
    public static void setNbDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    // Pour ne pas permettre choisir une ingredient non disponible dans le stock 
    public void nonDisponible() throws NotInStockException{
        if (nbDansStock < 0) {
            throw new NotInStockException(); 
        }
    }
}
