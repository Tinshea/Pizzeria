import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
    public class Main {
        
        private static void inmenu(int nombre) throws NoinmenuException{
            if(nombre>18){
                    throw new NoinmenuException();
                
            }
        }
        
        
        public static void main(String[] args) throws InterruptedException {
            

            Scanner scanner = new Scanner(System.in);
            Commande p = Commande.getInstance();
            File file= new File("Serveur.txt");
            File MenuPizza= new File("MenuPizza.txt");
         
           //Bloc Pour afficher les dessins
           try{
               BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
               String line= reader.readLine();
               while(line!=null)
               {
                   System.out.println(line);
                   line=reader.readLine();
               }
               reader.close();
           }catch(IOException exp){
               System.out.println("Erreur d'ouverture");
           }
           System.out.println("");
            int nombre=0;
            String reponse="";
            boolean vegetarien=false;
            boolean condition2=true;
          
            
      

            while(condition2){
                
                boolean condition=true;
                boolean condition3=true;

                while(condition3){

                    Commande.LireDoucement("Etes-vous vegetarien ? Repondez par Oui ou par Non");
                        reponse = scanner.next();
                        
                        // le == ne marche donc equal
                        if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                            condition3=false;
                           
            
    
                        }else{ Commande.LireDoucement("Desole je n'ai pas compris");}
                     
    
                    }

                    if((reponse.equals("Oui")) || (reponse.equals("oui")) ){
                        vegetarien=true;

                        }
                //bloc pour le Choix du menu
                while(condition){
                    Commande.LireDoucement("Choississez votre Menu :");
                    Thread.sleep(500);
                try{
                    //Lit l'entier écrit par l'utilisateur et l'affecte 
                    // à  la variable nombre du programme

                    try{
                        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(MenuPizza),"UTF-8"));
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
                    nombre = scanner.nextInt();
                    inmenu(nombre);
                    p.addMenu(nombre,vegetarien);
                    vegetarien=false;
                    condition=false;
                    
                    
                  
                
                } catch(InputMismatchException e){

                    Commande.LireDoucement("Vous n'avez pas rentrer un nombre valide, Veuillez reessayer !!");  
                    Thread.sleep(1000);
                    scanner.nextLine();}
        

                catch(NoinmenuException e){
                    Commande.LireDoucement("Ce n'est pas dans le menu !!");  
                        Thread.sleep(1000);
                        scanner.nextLine();
                }

    
                }

                condition3=true;
                while(condition3){

                    Commande.LireDoucement("Voulez vous commander la meme chose ? Repondez par Oui ou par Non");
                        reponse = scanner.next();
                        
                        
                        if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                            condition3=false;
                           
            
    
                        }else{  Commande.LireDoucement("Desole je n'ai pas compris");}
                     
    
                    }

                    if((reponse.equals("Oui")) || (reponse.equals("oui")) ){
                        p.addlememeMenu();

                        }



                condition3=true;
             while(condition3){

                Commande.LireDoucement("Voulez vous commander autre chose ? Repondez par Oui ou par Non");
                    reponse = scanner.next();
                    
                    
                    if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                        condition3=false;
                       
        

                    }else{ Commande.LireDoucement("Desole je n'ai pas compris");}
                 

                }
               
                if((reponse.equals("Non")) || (reponse.equals("non")) ){
                    
                condition2=false;
                }
            }
            System.out.println(p);
            scanner.close();}      
}
    
