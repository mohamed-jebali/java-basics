import java.util.Scanner;


public class Exercise6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quale Figura Geometrica vuoi scegliere tra A) Triangolo B) Rettangolo??");

        String inputUser = input.nextLine();

        

        if(!(inputUser.equals("A") || inputUser.equals("a") || inputUser.equals("B") || inputUser.equals("b"))){
            System.out.println("Errore inserisci una delle due opzioni");
        }
        else{

        if(inputUser.equals("A") || inputUser.equals("a")){

             System.out.println("Hai scelto triangolo Inserisci i dati della base");

             double inputBase = input.nextDouble();

             System.out.println("Inserisci i dati dell'altezza");

             double InputHeight = input.nextDouble();


             input.close();

            System.out.println("l'area del triangolo è: " + inputBase * InputHeight / 2);
        }




    else if (inputUser.equals("B") || inputUser.equals("b")){
        System.out.println("Hai scelto Rettangolo Inserisci i dati della base");

             double inputBase = input.nextDouble();

             System.out.println("Inserisci i dati dell'altezza");

             double InputHeight = input.nextDouble();


             input.close();

            System.out.println("l'area del rettangolo è: " + inputBase * InputHeight);
    }



}
        }

}


// Esercizio 6

// Scrivi un programma Java che chieda all'utente  di scegliere tra due numeri (0 per calcolare l'area di un triangolo e 1 per l'area di un rettangolo) e, in base a quale figura geometrica ha scelto, chiedere i dati mancanti e stampare l'area della figura geometrica richiesta.

// Esempio

// Se l'utente sceglie 0, chiedere di inserire base e altezza, calcolare l'area (base*altezza/2)  e stamparla.

// Se l'utente sceglie 1, chiedere inserire il valore del lato, calcolare  l'area (lato*lato)  e stamparla.
