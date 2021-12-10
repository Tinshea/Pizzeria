import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        
        private static void inmenu(int nombre) throws NoinmenuException{
            if(nombre>15){
                    throw new NoinmenuException();
                
            }
        }
        public static void main(String[] args) throws InterruptedException{
            
            Scanner scanner = new Scanner(System.in);
            Commande p = Commande.getInstance();

            // Affiche "Ecrire un nombre: "
           
            boolean condition=true;
            int nombre=0;
            String reponse;
            boolean condition2=true;
            boolean condition3=true;

            

            while(condition2){
                //bloc pour le Choix du menu
                while(condition){
                    System.out.println("Choississez votre Menu");

                try{
                    //Lit l'entier écrit par l'utilisateur et l'affecte 
                    // à  la variable nombre du programme

                    nombre = scanner.nextInt();
                    System.out.println(nombre);
                    condition=false;
                    inmenu(nombre);
                
                } catch(InputMismatchException e){

                    System.out.println("Vous n'avez pas rentrer un nombre valide, Veuillez reessayer !!");  
                    Thread.sleep(1000);
                    scanner.nextLine();}
                catch(NoinmenuException e){
                        e.printStackTrace();
                        Thread.sleep(1000);
                        scanner.nextLine();
                }finally{scanner.close();}

                    p.setchoix_menu(nombre);
                    System.out.println(p);

                }

                
             System.out.println("Voulez vous commander autre chose ? Repondez par Oui ou par Non");

             while(condition3){

                try{
                    boolean b=true;
                    
                //Lit l'entier écrit par l'utilisateur et l'affecte 
                // à  la variable nombre du programme
                    reponse = scanner.next();
                    condition3=false;
                    

                    if(reponse!="Oui" || reponse!="Non" || reponse!="oui" || reponse!="non"){

                        System.out.println("Desole je n'ai pas compris");
                    }

                // Affiche le nombre saisit par l'utilisateur10
                }catch(Exception e){
                    
                    System.out.println("Vous n'avez pas rentrer une reponse valide, Veuillez reessayer !!");  
                    Thread.sleep(1000); 
                    scanner.nextLine();}finally{scanner.close();}

                }

                condition2=false;
            }
        }       
}
    
