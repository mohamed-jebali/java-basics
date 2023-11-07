import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionExercise {
    

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Inserisci il primo numero");

            int inputUser1 = input.nextInt();

            System.out.println("Inserisci il secondo numero");

            int inputUser2 = input.nextInt();

            if(inputUser1 > inputUser2){
                System.out.println("Il primo numero è piu' grande");
            }
            else if(inputUser1 < inputUser2){
                System.out.println("Il secondo numero è piu' grande");
            }
            else{
                System.out.println("I numeri sono uguali");
            }
        }
        catch(InputMismatchException error){
            System.out.println("Errore Inserisci un valore numerico");
        }
        finally{
            input.close();
        }


    }
}
