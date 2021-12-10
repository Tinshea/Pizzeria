import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
    public class Main extends LireDoucement  {
        
        private static void inmenu(int nombre) throws NoinmenuException{
            if(nombre>15){
                    throw new NoinmenuException();
                
            }
        }
        public void LireDoucement(String s){
            for(int i=0;i<s.length();i++){
                System.out.println(i);
                Thread.sleep(100);
            }
        }
        public static void main(String[] args) {
            

            Scanner scanner = new Scanner(System.in);
            Commande p = Commande.getInstance();
            File file= new File("Serveur.txt");
         
           
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
            int nombre=0;
            String reponse="";
            boolean vegetarien=false;
            boolean condition2=true;
          
            
      

            while(condition2){
                
                boolean condition=true;
                boolean condition3=true;

                while(condition3){
                    Thread.sleep(1000);

                    System.out.println("etes-vous vegetarien ? Repondez par Oui ou par Non");
                        reponse = scanner.next();
                        
                        
                        if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                            condition3=false;
                           
            
    
                        }else{ System.out.println("Desole je n'ai pas compris");}
                     
    
                    }

                    if((reponse.equals("Oui")) || (reponse.equals("oui")) ){
                        vegetarien=true;

                        }

                //bloc pour le Choix du menu
                while(condition){
                    System.out.println("Choississez votre Menu");   
                  
                try{
                    //Lit l'entier écrit par l'utilisateur et l'affecte 
                    // à  la variable nombre du programme

                    nombre = scanner.nextInt();
                    inmenu(nombre);
                    p.addMenu(nombre,vegetarien);
                    condition=false;
                    
                    
                  
                
                } catch(InputMismatchException e){

                    System.out.println("Vous n'avez pas rentrer un nombre valide, Veuillez reessayer !!");  
                    Thread.sleep(1000);
                    scanner.nextLine();}
        

                catch(NoinmenuException e){
                    System.out.println("Ce n'est pas dans le menu !!");  
                        Thread.sleep(1000);
                        scanner.nextLine();
                }

    
                }

                condition3=true;
                while(condition3){

                    System.out.println("Voulez vous commander la meme chose ? Repondez par Oui ou par Non");
                        reponse = scanner.next();
                        
                        
                        if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                            condition3=false;
                           
            
    
                        }else{ System.out.println("Desole je n'ai pas compris");}
                     
    
                    }

                    if((reponse.equals("Oui")) || (reponse.equals("oui")) ){
                        p.addlememeMenu();

                        }



                condition3=true;
             while(condition3){

                System.out.println("Voulez vous commander autre chose ? Repondez par Oui ou par Non");
                    reponse = scanner.next();
                    
                    
                    if(  (reponse.equals("Oui"))  || (reponse.equals("Non")) || (reponse.equals("oui")) || (reponse.equals("non")) ){
                        condition3=false;
                       
        

                    }else{ System.out.println("Desole je n'ai pas compris");}
                 

                }
               
                if((reponse.equals("Non")) || (reponse.equals("non")) ){
                    
                condition2=false;
                }
            }
            System.out.println(p);
            scanner.close();}      
}
    
