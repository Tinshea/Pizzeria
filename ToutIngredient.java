import java.util.ArrayList ;

public class ToutIngredient {
    private static ArrayList <Ingredient> lstIngredients= new ArrayList<Ingredient>();
    private static double prix;

    public ToutIngredient() {      
        prix = 0.0;
    }
    public static void ajouterSupplement (Ingredient i) {
        lstIngredients.add(i); 
        prix += i.getPrix();
    }
    public String toString() {
        return "Tout les ingredients: \n" + lstIngredients.toString()+"\nPrix au total : " +prix;
    }
    public Ingredient getLstIngredient(int i) {
        return lstIngredients.get(i); 
    }

    public int sizeLstIngredient() {
        return lstIngredients.size(); 
    }
    public double getPrix() {return prix; }
}
