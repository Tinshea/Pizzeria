public class Compose extends Pizza {
    static String reponse=""; 
    private String Sauce;
    static boolean condition=true;
    private static Ingredient I;
    private static Ingredient Ingredient;
   

    private static String[] tabIngredient={"Olive","Jambon","Fromage","Champignon"};

    public Compose(int taille,boolean vegetarien,String Sauce,Ingredient Ingredient) {
        super(taille,vegetarien);
        this.Sauce=Sauce;
        this.Ingredient=Ingredient;
     
    }
    
    public static void DemandeIngredient() throws InterruptedException{
        
        condition=true;
        Boolean condtemp=false;
        while(condition){
        while(condition){
            Commande.LireDoucement("choisissez vos ingredients : Repondez par le nom de l'ingredient");
                reponse = scanner.next();
                
                for(int i=0;i<tabIngredient.length;i++){
                if(  (reponse.equals(tabIngredient[i]))){
                    condition=false;
                    condtemp=true;
                  }}

                    if(condtemp){
                }else{ Commande.LireDoucement("Desole je n'ai pas compris");}

            }
            
            switch(reponse){
                case "Olive":I=new Olive();break;
                case "Jambon":I=new Jambon();break;
                case "Fromage":I=new Fromage();break;
                case "Champignon":I=new Champignon();break;
            }
            Ingredient.ajouterSupplement(I);
            System.out.println(I);
            condition=true;

            while(condition){
                Commande.LireDoucement("Voulez vous un autre Ingredient : Repondre par oui ou non");
                    reponse = scanner.next();
                
                    // le == ne marche donc equal
                    if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                        condition=false;
                        
                    }else{ Commande.LireDoucement("Desole je n'ai pas compris");}
                    
    
                }
                condition=true;
    
                if((reponse.equals("Non")) || (reponse.equals("non")) ){
                    condition=false;
    
                    }
    
                }
        }

   
    public static String DemandeSauce() throws InterruptedException{
        condition=true;
        while(condition){

            Commande.LireDoucement("Sur la Pizza Sauce Tomate ou Blanche ? Repondez par Tomate ou Blanche");
                reponse = scanner.next();
                
                if(  (reponse.equals("Tomate"))  || (reponse.equals("Blanche")) || (reponse.equals("tomate")) || (reponse.equals("blanche")) ){
                    condition=false;
                    
    

                }else{  Commande.LireDoucement("Desole je n'ai pas compris");}
            }
            
            return reponse;

                }

                public Compose clone(){
                    return new Compose(taille,vegetarien,Sauce,Ingredient);
                }
                public String toString(){
                    String s="Vos ingredients sont :\n";
                    for (int i = 0; i < this.Ingredient.sizeLstIngredient(); ++i) {
                        s +=Ingredient.getLstIngredient(i);
                    }
                    return super.toString()+s;

                    
                }
        }      



