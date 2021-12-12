public class Fromage extends Ingredient {
    private static int nbDansStock = 10; 
    public Fromage () {
        super("Fromage", 0.50,true);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock
    @Override
    public void nonDisponible() {
        if (nbDansStock == 0) {
            System.out.println("Il ne reste plus de Fromage, veuillez choisir une autre ingredient ");
        }
    }
}
