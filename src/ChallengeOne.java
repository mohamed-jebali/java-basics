public class ChallengeOne {
    public static int[] odds(int numOdds) {
        /**
         * Return an array of the first numOdds odd numbers
         * Arguments
         * numOdds - a positive integer representing the number of odd numbers to store in the array
         * Examples
         * odds(3) returns [1, 3, 5]
        */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code that will create an array with the first numOdds
        //        odd numbers and return the array

        int[] newArray = new int[numOdds]; // creo un nuovo array di tipo int e imposto come argomento numOdds
        int firstOdd = 1; // imposto il primo numero dispari uguale a 1

        for (int i = 0; i < numOdds; i++) { // eseguo un ciclo for itero l'argomento dell'array numOdds
            newArray[i] = firstOdd; // assegno il valore corrente di firstOdd all'elemento dell'array corrente ad ogni iterazione


            if(firstOdd % 2 != 0){ // verifico ad ogni iterazione se il numero e' dispari
                firstOdd += 2; // se il numero e' dispari eseguo la somma di firstOdd + 2 per ottenere i numeri dispari successivi
            }
        }

        return newArray; // ritorno l'array numerico di numeri dispari

        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        int[] theOdds = odds(3);
        // Expected output is 
        // 1, 3, 5
        System.out.println(theOdds[0] + ", " + theOdds[1] + ", " + theOdds[2]);
    }
}
