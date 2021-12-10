package main.ressources.supplementaires.tests;


import main.ressources.supplementaires.ingredients.Ingredient;
import main.ressources.supplementaires.ingredients.Champignon;
import main.ressources.supplementaires.ingredients.Fromage;
import main.ressources.supplementaires.Supplements;
import main.ressources.supplementaires.ingredients.Jambon;

public class TestSupplementaires {
    public static void main (String [] args) {
        Supplements s1 = new Supplements();
        Ingredient i1 = new Fromage();
        Ingredient i2 = new Champignon();
        s1.ajouterSupplement(i1);
        s1.ajouterSupplement(i2);
        s1.ajouterSupplement(new Jambon());
        System.out.println(s1);
    }
}
