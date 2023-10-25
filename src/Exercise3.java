import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il primo numero");

        int numero1 = input.nextInt();

        System.out.println("Inserisci il secondo numero");

        int numero2 = input.nextInt();


        System.out.println("Inserisci il terzo numero");

        int numero3 = input.nextInt();


        input.close();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("il numero maggiore è: " + numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("il numero maggiore è: " + numero2);
        }
        else if(numero3 > numero1 && numero3 > numero2){
             System.out.println("il numero maggiore è: " + numero3);
        }
        else{
            System.out.println("i numeri sono uguali");
        }
    }
}




// Esercizio 3

// Scrivi un programma Java che prende tre numeri da tastiera e stampi il maggiore.