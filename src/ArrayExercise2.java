public class ArrayExercise2 {
    public static void main(String[]args){


        int[] arrayProva = {33,44,55,66};

        // shift verso sinistra l'indice si sposta nella posizione 1 e il primo elemento viene eliminato ci sono
        // le seguenti posizioni [0] [1] [2]
        // con indice 44

        for (int i = 0; i < arrayProva.length - 1; i++) { // parto da zero scorro l'arrayper la lunghezza meno 1 perche' l'elemento iniziale verra' eliminato percio' cambia la size dell'array
            System.out.println(arrayProva[i] = arrayProva[i+1]);
        }

        // output prima
        // [0] [1] [2] [3]
        // 33   44  55  66

        // output dopo
        // [0] [1] [2]
        //  44  55  66


        System.out.println("l'indice dell'array adesso è: " + arrayProva[0]);


        int[] arrayProva2 = {11,22,88,99};



        // shift verso destra l'ultimo elemento dell'array viene eliminato quindi ci sono le seguenti posizioni
        // [0] [1] [2]
        // con indice 11
        for (int j = arrayProva2.length-1; j > 0; j--) { // parto dalla fine dell'array con .length faccio
        // un iterazione inversa con j-- ed elimino l'ultimo elemento partendo l'interazione dalla coda dell'array
            System.out.println(arrayProva2[j] = arrayProva2[j-1]);
        }

        System.out.println("l'ultimo elemento dell'array adesso è: " + arrayProva2[3]);

        // output prima
        // [0] [1] [2] [3]
        // 11   22  88  99

        // output dopo
        // [0] [1] [2]
        //  11  22  88



        int[] arrayProva3 = {12,13,14,15};

        int index = arrayProva3[0]; // salvo in memoria l'indice dell'array

        for (int q = 0; q < arrayProva3.length -1; q++) { // prendo l'ultimo elemento dell'array lo interiamo
            arrayProva3[q] = arrayProva3[q + 1]; // incremento di una posizione l'ultimo elemento
        }
        arrayProva3[arrayProva3.length-1] = index; // l'ultimo elemento dell'array e' uguale a index cioe' all variabile che indica l'indice

        for (int element : arrayProva3) {
            System.out.print(element + " "); // eseguo un ciclo foreach per interare l'arrayProva3 per vedere l'output
        }

         // output prima
        // [0] [1] [2] [3]
        // 12   13  14  15

        // output dopo
        // [0] [1] [2] [3]
        // 13  14  15  12

        
        System.out.println("");

        
        // rotazione verso destra
        int[] arrayProva4 = {7,8,9,10};

        int last = arrayProva4[arrayProva4.length -1];

        for (int w = arrayProva4.length-1; w > 0; w--) {
            arrayProva4[w] = arrayProva4[w - 1];
        }
        arrayProva4[0] = last;

        for(int elementProva : arrayProva4){

            System.out.print(elementProva + " ");
        }

        // output prima
        // [0] [1] [2] [3]
        // 7   8    9  10

        // output dopo
        // [0] [1] [2] [3]
        // 10   7   8   9
 
    }
}
