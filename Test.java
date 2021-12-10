    import java.util.Scanner;
    public class Test {

        public static void main(String[] args) throws InterruptedException{
            
            Scanner scanner = new Scanner(System.in);

            // Affiche "Ecrire un nombre: "
           
            boolean condition=true;
            int nombre=0;
            String reponse;
            boolean condition2=true;
            boolean condition3=true;

            while(condition2){
            //bloc pour le Choix du menu
            while(condition){
                System.out.println("Choississez Votre Menu");
            try{
            //Lit l'entier écrit par l'utilisateur et l'affecte 
            // à  la variable nombre du programme
            nombre = scanner.nextInt();
            System.out.println(nombre);
            condition=false;
            scanner.close();
            // Affiche le nombre saisit par l'utilisateur10
            } catch(Exception e){
                System.out.println("Vous n'avez pas rentrer un nombre valide, Veuillez reessayer !!");  
                Thread.sleep(1000);
                scanner.nextLine();
            }
              Commande p = Commande.getInstance();
             p.setchoix_menu(nombre);
             System.out.println(p);
        }
             System.out.println("Voulez vous commander autre chose ? Repondez par Oui ou par Non");

             while(condition3){
            try{
                boolean b=true;
                
            //Lit l'entier écrit par l'utilisateur et l'affecte 
            // à  la variable nombre du programme
            reponse = scanner.nextLine();
            condition3=false;
            scanner.close();
            if(reponse!="Oui" || reponse!="Non" || reponse!="oui" || reponse!="non"){
                System.out.println("Desole je n'ai pas compris");
            }

            // Affiche le nombre saisit par l'utilisateur10
            } catch(Exception e){
                System.out.println("Vous n'avez pas rentrer une reponse valide, Veuillez reessayer !!");  
                Thread.sleep(1000); 
                scanner.nextLine();
            }
            }
        }
    }
            

            
        }
    
