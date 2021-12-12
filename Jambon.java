public class Jambon extends Ingredient {
    private static int nbDansStock = 10; 
    public Jambon () {
        super ("Jambon",  (float)0.5, false);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    public void nonDisponible() throws NotInStockException{
        if (nbDansStock <= 0) {
            throw new NotInStockException(); 
        }
    }
}
