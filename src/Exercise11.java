import java.util.Scanner;

public class Exercise11 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero");

        if(!(input.hasNextInt())){
            System.out.println("Errore Inserisci un valore numerico");
        }

        int inputNumber = input.nextInt();

        for (int i = 0; i <= inputNumber; i++) {
            int result = inputNumber * i;
            System.out.println(inputNumber + " X " + i + " = " + result);
        }

        input.close();
    }
}

// Esercizio 11

// Scrivere un programma in Java per visualizzare la tabella di moltiplicazione di un dato numero intero.


// Dati di test

// Immettere il numero (Tabella da calcolare): Immettere il numero di termini: 5

// Uscita prevista:


// 5 X 0 = 0

// 5 X 1 = 5

// 5 X 2 = 10

// 5 X 3 = 15

// 5 X 4 = 20

// 5 X 5 = 25