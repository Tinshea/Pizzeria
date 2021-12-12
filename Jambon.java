public class Jambon extends Ingredient {
    private static int nbDansStock = 10; // Nb d'ingredient restant dans le stock
    // Constructeur 
    public Jambon () {
        super ("Jambon", 0.5, false);
    }
    public static int getOliveDansStock() {return nbDansStock; } // Acceder aux nb d'ingredient restant dans le stock
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    // Pour ne pas permettre choisir une ingredient non disponible dans le stock 
    public void nonDisponible() throws NotInStockException{
        if (nbDansStock < 0) {
            throw new NotInStockException(); 
        }
    }
}
