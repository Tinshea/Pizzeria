
public class Champignon extends Ingredient {
    private static int nbDansStock = 10; 
    public Champignon() {
        super("Champignon", 0.5, true);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    public void nonDisponible() throws NotInStockException{
        if (nbDansStock <= 0) {
            throw new NotInStockException(); 
        }
    }
}
