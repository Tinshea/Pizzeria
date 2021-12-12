public class Jambon extends Ingredient {
    private static int nbDansStock = 10; 
    public Jambon () {
        super ("Jambon",  (float)0.5, false);
    }
    public static int getOliveDansStock() {return nbDansStock; } 
    public static void setOliveDansStock (int x) { nbDansStock = x; } // Pour remplir le stock

    @Override
    public void nonDisponible() {
        if (nbDansStock == 0) {
            System.out.println("Il ne reste plus de Jambon, veuillez choisir une autre ingredient ");
        }
    }
}
