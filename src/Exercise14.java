import java.util.Scanner;

public class Exercise14 {
    public static void main(String[]args){


        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        
        int inputNumber = input.nextInt();

        System.out.println("Il numero di input inserito è: " + inputNumber);

        int sum = 0;

        System.out.print("i numeri dispari sono: ");


        for (int i = 0; i <= inputNumber; i++) {
            if(!(i % 2 == 0)){
                int oddNumber = i;
                System.out.print(i);

                if(i < inputNumber -1){
                    System.out.print(",");
                }
                
               
                sum += oddNumber;
            }


        }


        System.out.println("\nLa somma del numero naturale dispari fino a 5 termini è: " + sum);
        input.close();
        

    }
    
}

// Esercizio 14

// Scrivi un programma in Java per visualizzare gli n, con n preso in input, numeri dispari e la loro somma.


// Esempio


// Dati di test

// Il numero di input inserito è: 10

// Uscita prevista:


// I numeri dispari sono:

// 1

// 3

// 5

// 7

// 9

// La somma del numero naturale dispari fino a 5 termini è: 25
