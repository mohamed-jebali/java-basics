package com; // creare la cartella com
import java.util.Scanner; // Importo il package Scanner

public class ScannerApp {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in); // Creo un'istanza dell'oggetto Scanner per leggere da tastiera
        System.out.println("Inserisci il tuo nome: "); // Messaggio che chiede di inserire il nome
        String nome = scan.next(); // Leggo il nome inserito


        if(nome.equals("Jack") || nome.equals("John")){ // il metodo .equals() confronta le stringhe usando l'operatore logico OR(||)
            System.out.println("SEI TRA I VIP!");
        }

        System.out.println("Inserisci il tuo cognome: "); // Messaggio che chiede di inserire il nome
        String cognome = scan.next(); // Leggo il nome inserito

        if(nome.equals("Benito") && cognome.equals("Mussolini")){
            System.out.println("SEI NELLA LISTA NERA NON PUOI ENTRARE");

            scan.close();
        }

        System.out.println("Inserisci il numero della classe: "); // Messaggio che chiede di inserire il nome
        int classe = scan.nextInt(); // Leggo il nome inserito

        System.out.println("Ciao " + nome + " " +  cognome + " la tua classe è: " + classe); // Stampo un messaggio di saluto con il nome inserito

        scan.close(); // Chiudo l'oggetto Scanner per rilasciare le risorse
    }
}
