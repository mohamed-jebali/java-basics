import java.util.Scanner;
import java.util.InputMismatchException;

public class FizzBuzz {
    public static void main (String[]args){


        Scanner input = new Scanner(System.in);

        try{

        System.out.println("inserisci un numero maggiore di 5");

        int numberInput = input.nextInt();
        
        if(numberInput <= 5){
             System.out.println("Errore : inserisci un numero maggiore di 5");
        }
        else{
            for (int i = 1; i < numberInput; i++) {
                
                String message = null;

                if(numberInput % 3 == 0 && numberInput % 5 == 0){
                    message = "FIZZBUZZ";
                }
                else if(numberInput % 3 == 0){
                   message = "FIZZ";
                }    
                
                else if(numberInput % 5 == 0){
                    message = "BUZZ";
                }
                System.out.println(message);
                
            }
            input.close();

            }             
        }
        catch(InputMismatchException error){
            System.out.println("Errore inserisci un valore numerico");
        }
}
}
