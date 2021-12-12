
public class Champignon extends Ingredient {
    private static int nbDansStock = 10; 
    public Champignon() {
        super("Champignon", 0.5, true);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    @Override
    public void nonDisponible() {
        if (nbDansStock == 0) {
            System.out.println("Il ne reste plus de Champignon, veuillez choisir une autre ingredient ");
        }
    }
}
