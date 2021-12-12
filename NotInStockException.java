public class NotInStockException extends Exception {
    public NotInStockException () {
        super("Malheureusement il ne reste plus c'est ingredient dans le stock, veuillez en choisir une autre");
   }
}