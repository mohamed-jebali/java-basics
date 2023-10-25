import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi il numero del mese tra 1 a 12");

        if (input.hasNextInt()) {
            int inputUtente = input.nextInt();
            input.close();

            if (inputUtente < 1 || inputUtente > 12) {
                System.out.println("Errore: Non esiste un mese con il numero che hai digitato.");
            } else if (inputUtente == 1) {
                System.out.println("Gennaio ha 31 giorni");
            } else if (inputUtente == 2) {
                System.out.println("Febbraio ha 28 giorni");
            } else if (inputUtente == 3) {
                System.out.println("Marzo ha 31 giorni");
            } else if (inputUtente == 4) {
                System.out.println("Aprile ha 30 giorni");
            } else if (inputUtente == 5) {
                System.out.println("Maggio ha 31 giorni");
            } else if (inputUtente == 6) {
                System.out.println("Giugno ha 30 giorni");
            } else if (inputUtente == 7) {
                System.out.println("Luglio ha 31 giorni");
            } else if (inputUtente == 8) {
                System.out.println("Agosto ha 31 giorni");
            } else if (inputUtente == 9) {
                System.out.println("Settembre ha 30 giorni");
            } else if (inputUtente == 10) {
                System.out.println("Ottobre ha 31 giorni");
            } else if (inputUtente == 11) {
                System.out.println("Novembre ha 30 giorni");
            } else if (inputUtente == 12) {
                System.out.println("Dicembre ha 31 giorni");
            }
        } else {
            System.out.println("Errore: Input non numerico.");
        }
    }
}


// Esercizio 4

// Scrivi un programma Java che restituisce il numero di giorni di un mese dato in input dall’utente. Il mese è dato sotto forma di intero, ad esempio 3 corrisponde a marzo. Ignorare gli anni bisestili.