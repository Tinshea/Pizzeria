package paquet1.souspaquet1.sousSousPaquet1;


import paquet1.Ingredient;
import paquet1.souspaquet1.Champignon;
import paquet1.souspaquet1.Fromage;
import paquet1.Supplements;
import paquet1.souspaquet1.Jambon;

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
