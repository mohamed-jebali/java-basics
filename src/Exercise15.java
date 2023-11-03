import java.util.Scanner;

public class Exercise15 {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int inputNumber = input.nextInt();

        int result = 1;

        for (int i = 1; i <= inputNumber; i++) {

            result = (i * i * i);
            System.out.println("Il numero è: " + i + " e il cubo di " + i + " è: " + result);
        }

        input.close();


    }
}


// Esercizio 15

// Scrivi un programma in Java per visualizzare il cubo del numero fino a un intero preso in input.


// Esempio


// Dati di test

// Inserire il numero di termini: 4

// Uscita prevista:


// Il numero è: 1 e il cubo di 1 è: 1

// Il numero è: 2 e il cubo di 2 è: 8

// Il numero è: 3 e il cubo di 3 è: 27

// Il numero è: 4 e il cubo di 4 è: 64