public  class NoinmenuException  extends Exception {
    // Exception si le choix n'est pas dans le menu
    public NoinmenuException () {
       super("Ce n'est pas dans le Menu") ;
   }
}