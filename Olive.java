public class Olive extends Ingredient {
    private static int nbDansStock = 10; 
    public Olive() {
        super("Olive",0.2, true);
        nbDansStock --;  
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    @Override
    public void nonDisponible() {
        if (nbDansStock == 0) {
            System.out.println("Il ne reste plus d'Olive, veuillez choisir une autre ingredient ");
        }
    }
}
