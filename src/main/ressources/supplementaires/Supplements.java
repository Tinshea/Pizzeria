package main.ressources.supplementaires;
import main.ressources.supplementaires.ingredients.Ingredient;

import java.util.ArrayList ;

public class Supplements {
    private ArrayList <Ingredient> lstIngredients ;
    private float prix;
    public Supplements() {
        lstIngredients = new ArrayList<Ingredient>();
        prix = 0;
    }
    public void ajouterSupplement (Ingredient i) {
        lstIngredients.add(i); // new?
        prix += i.getPrix();
    }
    public String toString() {
        return "Supplements : \n" + lstIngredients.toString()+"\nPrix total supplements : " +prix;
    }
}
