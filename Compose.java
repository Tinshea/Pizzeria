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
    static File ingredientfFile= new File("Ingredient.txt"); 
   

    private static String[] tabIngredient={"Jambon","Olive","Fromage","Champignon","jambon","olive","fromage","champignon"};
    public Compose(int taille,boolean vegetarien,String Sauce,Ingredient Ingredient) {

        super(taille,vegetarien);
        this.Sauce=Sauce;
        this.Ingredient=Ingredient;
        //on Initialise les prix des pizza avec la taille
        switch(taille){
        case 26: super.Prix = 5+ Ingredient.getPrixTotal(); break;
        case 33: super.Prix = 7+ Ingredient.getPrixTotal(); break;
        case 40: super.Prix= 9+ Ingredient.getPrixTotal(); break;
        default: break;
        }
    }
    public Compose(){super();}
    //methode pour afficher les ingredient
        public void affiche() throws InterruptedException{
            
            try{
                BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(ingredientfFile),"UTF-8"));
                
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
    //demande l'ingredient
    public static void DemandeIngredient() throws InterruptedException{
        condition=true;
        Boolean condtemp=false;
        while(condition){
            while(condition){ 
                //on fait la saisie de reponse
                Commande.LireDoucement("choisissez vos ingredients : Repondez par le nom de l'ingredient");
                    reponse = scanner.next();
                for(int i=0;i<tabIngredient.length;i++){
                    if((reponse.equals(tabIngredient[i]))){
                        condition=false;
                        condtemp=true;}
                }
                if(!condtemp)
                {Commande.LireDoucement("Desole je n'ai pas compris");
                }

            }
            //on regarde la reponse
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
                default: break;
                }
            //on rajoute l'ingredient à notre arraylist
            Ingredient.ajouterSupplement(I);
            System.out.println(I);
            condition=true;
            //on demande si il veut un autre ingredient
            while(condition){
                Commande.LireDoucement("Voulez vous un autre Ingredient : Repondre par oui ou non");
                reponse = scanner.next();
                // le == ne marche donc equal
                if( (reponse.equals("Oui")) || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                    condition=false; 
                }else{ Commande.LireDoucement("Desole je n'ai pas compris");}
            }
            condition=true;
        
            if((reponse.equals("Non")) || (reponse.equals("non")) ){
                condition=false;}
            }
        }

    //Demande la sauce pour la pizza 
    public static String DemandeSauce() throws InterruptedException{
        condition=true;
        while(condition){
            Commande.LireDoucement("Sur la Pizza Sauce Tomate ou Blanche ? Repondez par Tomate ou Blanche");
                reponse = scanner.next();
                if( (reponse.equals("Tomate")) || (reponse.equals("Blanche")) || (reponse.equals("tomate")) || (reponse.equals("blanche")) ){
                    condition=false;
                }else{  Commande.LireDoucement("Desole je n'ai pas compris");}}

            return reponse;
        }

        //Pour pour cloner notre pizza composer
        public Compose clone(){
            return new Compose(taille,vegetarien,Sauce,Ingredient);}
        

        //getteur
        public double getprixdepizza(){
        return super.Prix;}

        @Override
        public String toString(){
            String s="Vos ingredients sont :\n";
            for (int i = 0; i < this.Ingredient.sizeLstIngredient(); ++i) {
                s +=Ingredient.getLstIngredient(i);
            }
            return super.toString()+s+"Vous avez Pris la Sauce "+Sauce+ "\nPrix de la pizza : " + getprixdepizza()+"Euros\n";
        }

                
}      



