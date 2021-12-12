import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compose extends Pizza {
    static String reponse=""; 
    private String Sauce;
    static boolean condition=true;
    private static Ingredient I;
    private static Ingredient Ingredient;
    static File ingredient= new File("Ingredient.txt");
    private double prix; 
   

    private static String[] tabIngredient={"Jambon","Olive","Fromage","Champignon","jambon","olive","fromage","champignon"};

    public Compose(int taille,boolean vegetarien,String Sauce,Ingredient Ingredient) {
        super(taille,vegetarien);
        this.Sauce=Sauce;
        this.Ingredient=Ingredient;
        if (taille == 26) {this.prix = 5+ Ingredient.getPrixTotal();}
        if (taille == 33) {this.prix = 7+ Ingredient.getPrixTotal();}
        if (taille == 40) {this.prix= 9+ Ingredient.getPrixTotal();}
    }
    public Compose(){super();}
    
        public void affiche() throws InterruptedException{
            
         try{
            BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(ingredient),"UTF-8"));
            
            String line= reader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                Thread.sleep(15);
                line=reader.readLine();
            }
            reader.close();
        }catch(IOException exp){
            System.out.println("Erreur d'ouverture");
        }
        
    }
    public double getPrix() {return prix; }
    
    public static void DemandeIngredient() throws InterruptedException{
        
        condition=true;
        Boolean condtemp=false;
        while(condition){
        while(condition){
            // Afficher les ingredients
                for (int i = 0; i < tabIngredient.length/2; i++) { // Afficher tous les ingredients, si client est nonVeget
                    System.out.println((i+1)+". "+tabIngredient[i]);
                } 

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
                // Si la reponse avec minuscule 
                case "olive":I=new Olive();break;
                case "jambon":I=new Jambon();break;
                case "fromage":I=new Fromage();break;
                case "champignon":I=new Champignon();break;

            
            }
            try {
                Fromage.nonDisponible();
                }catch(NotInStockException e){Commande.LireDoucement("Desoler nous n'avons plus cet ingredient");}
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
                    return super.toString()+s + "Prix de la pizza : " + this.getPrix()+"\n";

                    
                }

                
        }      



