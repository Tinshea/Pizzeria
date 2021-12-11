import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main {
        
        public static void main(String[] args) throws InterruptedException {
            

            Scanner scanner = new Scanner(System.in);
            Commande p = Commande.getInstance();
            File file= new File("Serveur.txt");
         
           //Bloc Pour afficher lle Logo 
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

           //Variable general
            int nombre=0;
            String reponse="";
            int taille=0;
            boolean vegetarien=false;
            boolean condition2=true;
          
            
      

            while(condition2){
                
                boolean condition=true;
                boolean condition3=true;

                //Bloc pour savoir si la personne est vegetarien
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


                condition3=true;
                //bloc pour savoir si la personne veut composer ou choisir dans le menu
                while(condition3){

                    Commande.LireDoucement("Voulez-vous composez votre Pizza ou choisir dans le menu : Repondez par composer ou menu");
                        reponse = scanner.next();
                        
                        // le == ne marche donc equal
                        if(  (reponse.equals("composer"))  || (reponse.equals("Composer")) || (reponse.equals("Menu")) || (reponse.equals("menu")) ){
                            condition3=false;
                           
            
    
                        }else{ Commande.LireDoucement("Desole je n'ai pas compris");}
                     
    
                    }

                    if((reponse.equals("Composer")) || (reponse.equals("composer")) ){
                        System.out.println("compose ta pizza");

                        }else{

                    

                //bloc pour le Choix du menu
                while(condition){
                    Commande.LireDoucement("Choississez votre Menu :");
                    Thread.sleep(500);
                try{
    
                   //affiche le menu
                    Menu_Pizza.affichemenu();
                    nombre = scanner.nextInt();
                    Menu_Pizza.inmenu(nombre);
                    taille=Pizza.DemandetaillePizza();
                    p.addMenu(nombre,taille,vegetarien);
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
                //bloc pour commander autre chose
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
    
