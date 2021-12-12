public class NotInStockException extends Exception {
    //Exception si l'ingredient choisi ne plus disponible dans le stock
    public NotInStockException () {
        super("Malheureusement il ne reste plus c'est ingredient dans le stock, veuillez en choisir une autre");
   }
}