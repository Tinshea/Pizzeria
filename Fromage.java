public class Fromage extends Ingredient {
    private static int nbDansStock = 10; 
    public Fromage () {
        super("Fromage", 0.50,true);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock
    
    public void nonDisponible() throws NotInStockException{
        if (nbDansStock <= 0) {
            throw new NotInStockException(); 
        }
    }
}
