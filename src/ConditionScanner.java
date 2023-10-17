// Esercizio 1

// Scrivi un programma Java che prende due numeri da tastiera e stampa quello è più grande.


// Esempio

// Dati di test:

// Inserire il primo numero: 10

// Inserire il secondo numero: 5
// Uscita prevista:

// Il primo numero è più grande del secondo


import java.util.Scanner;

public class ConditionScanner {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il primo Numero");
        int number1 = scan.nextInt();

        System.out.println("Inserisci il secondo Numero");
        int number2 = scan.nextInt();


        if(number1 == number2){
            System.out.println("i numeri sono uguali");
        }
        else if(number1 > number2){
            System.out.println("il primo numero è piu' grande");
        }
        else{
            System.out.println("il secondo numero è piu' grande");
        }

        scan.close();
    }
}