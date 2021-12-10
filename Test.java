    import java.util.Scanner;

    public class Test {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            // Affiche "Ecrire un nombre: "
            System.out.println("Ecrire un nombre: ");
            boolean condition=true;
            int nombre=0;

            while(){}

            //bloc pour la commande
            while(condition){
            try{
            //Lit l'entier écrit par l'utilisateur et l'affecte 
            // à  la variable nombre du programme
            nombre = scanner.nextInt();
            System.out.println(nombre);
            condition=false;
            // Affiche le nombre saisit par l'utilisateur10
            } catch(Exception e){
                System.out.println("Vous n'avez pas rentrer un nombre valide\nVeuillez reessayer");  
                scanner.nextLine();
            }finally{
                scanner.close();
            }
            }
            

            Commande p = Commande.getInstance();
            p.setchoix_menu(nombre);
            System.out.println(p);
        }
    }
