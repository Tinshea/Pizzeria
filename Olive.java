public class Olive extends Ingredient {
    private static int nbDansStock = 10; 
    public Olive() {
        super("Olive",0.2, true);
        nbDansStock --;  
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    public void nonDisponible() throws NotInStockException{
        if (nbDansStock <= 0) {
            throw new NotInStockException(); 
        }
    }
}
