import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {
        int[] arrayNumeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] Even = new int[arrayNumeri.length];
        int[] Odd = new int[arrayNumeri.length];
        int indexEven = 0;
        int indexOdd = 0;

        for (int i = 0; i < arrayNumeri.length; i++) {
            if (arrayNumeri[i] % 2 == 0) {
                Even[indexEven] = arrayNumeri[i];
                indexEven++;
            } else {
                Odd[indexOdd] = arrayNumeri[i];
                indexOdd++;
            }
        }

        System.out.print("array numeri Pari: ");
        for (int i = 0; i < indexEven; i++) {
            System.out.print(Even[i] + " ");
        }

        System.out.println();

        System.out.print("array numeri Dispari: ");
        for (int i = 0; i < indexOdd; i++) {
            System.out.print(Odd[i] + " ");
        }



// Calcolare la somma dei numeri da 1 a 100 utilizzando un ciclo "for":

        System.out.println("");

        int sum = 0;

        for (int j = 0; j <= 100; j++) {
            sum +=j;
        }

        System.out.println("la somma dei numeri: " + sum);


// Stampare i numeri pari da 1 a 20 utilizzando un ciclo "for":

        System.out.print("i numeri pari da 1 a 20 sono: ");

        for (int tmp = 2; tmp <= 20; tmp += 2) { // 2 + 2 = 4 // 2 + 4 = 6 2 + 6 = 8 ecc .. 
            System.out.print(tmp + " ");
        }

         System.out.println("");

// Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando un ciclo "for":



      System.out.print("il prodotto tra i numeri dispari da 1 a 15 è: ");

      int prodotto = 1;
      for (int i = 1; i <= 15; i += 2) { // 1 + 2 = 3 // 3 + 2 = 5 // 5 + 2 = 7 ecc...
          prodotto *= i;
      }
      System.out.print(prodotto);


       System.out.println("");


// Stampare la tabellina del 5 utilizzando un ciclo "for":
       
       int moltiplicando = 5;

        System.out.print("la moltiplicazione del 5 è: ");

       for (int tb = 0; tb <= 10; tb++) { // 5 * 0 = 0 // 5 * 1 = 5 ecc..
         System.out.print(tb * moltiplicando + " ");
       }



       System.out.println("");

// Stampare i caratteri di una stringa uno alla volta utilizzando un ciclo "for":


       String SpidermanWord = "Spiderman";

       for (char tq = 0; tq < SpidermanWord.length(); tq++) {
        System.out.println(SpidermanWord.charAt(tq));
       }

           System.out.println("");

// Calcolare il fattoriale di un numero utilizzando un ciclo "for":


    int somma = 1;

    for (int i = 1; i <= 5; i++) { // 5 * 4 * 3 * 2 * 1 = 120
        somma*= i;
    }

     System.out.print("il fattoriale di 5 è: " + somma);


     System.out.println("");

// Stampare i numeri in ordine decrescente da 10 a 1 utilizzando un ciclo "for":

      for (int tw = 10; tw >= 1; tw--) {
        System.out.print(tw + " ");
      }


       System.out.println("");


// Stampare i quadrati dei numeri da 1 a 10 utilizzando un ciclo "for":



     for (int ax = 1; ax <= 10; ax++) {
       int squarePow =  ax * ax;
       System.out.println("i quadrati dei numeri da 1 a 10 sono: " + squarePow + " ");
     }



     System.out.println("");



// Stampare una sequenza di numeri in base all'input dell'utente utilizzando un ciclo "for":

     Scanner input = new Scanner(System.in);

     System.out.println("Inserisci un numero");



        if(!input.hasNextInt()){
            System.out.println("Errore inserisci un valore numerico");
        }
        else{
            int inputUserNumber = input.nextInt();

            System.out.print("Ecco la sequenza dei numeri in base all'input: ");

            for (int az = 0; az <= inputUserNumber; az++) {
            System.out.print(az + " ");
            }

            input.close();

        }

     
    

    }
}
