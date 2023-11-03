import java.util.Scanner;

public class Exercise13 {



    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero naturale");

        if(!(input.hasNextInt())){
            System.out.println("Errore Inserisci un valore numerico");
        }
        int inputNumber = input.nextInt();

        if(inputNumber < 1){
            System.out.println("Errore inserisci un numero naturale");
        }
        else{
            System.out.println("Numero di input: " + inputNumber);

            int result = 0;

            System.out.print("I primi n numeri naturali sono: ");

            for (int i = 1; i <= inputNumber; i++) {
                System.out.print(i);

                if(i < inputNumber){
                    System.out.print(',');
                }
                
                result += i;
            }

            System.out.println("");
            System.out.println("La somma del numero naturale fino a n termini: " + result);

        input.close();
        }
    }
}


// Esercizio 13

// Scrivi un programma in Java per visualizzare i primi n numeri naturali e la loro somma. n è preso in input

// Esempio

// Dati di test

// Inserisci il numero: 2

// Uscita prevista:

// Numero di input: 2

// I primi n numeri naturali sono: 2, 1

// La somma del numero naturale fino a n termini: 1+2 = 3





