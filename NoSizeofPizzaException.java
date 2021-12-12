public  class NoSizeofPizzaException  extends Exception {
    // Exception si la taille ne correspond aux tailles définis
    public NoSizeofPizzaException () {
       super("Ce n'est pas une taille de Pizza") ;
   }
}