import java.util.LinkedList;

public class LinkedListExericse {
    

    public static void main(String[]args){

        LinkedList<Integer> lista = new LinkedList<Integer>(); // dichiarazione del tipo di variabile LinkedList sintassi simile ai ArrayList
        

        lista.addFirst(25); // metodi di LinkedList simili ad ArrayList in questo metodo si aggiunge in testa
        lista.addLast(34); // metodo si aggiunge in coda

        lista.add(29); // aggiungi elemento alla LinkedList

        lista.set(1, 90); // modifica un elemento mettendo come primo argomento l'indice da modificare e come secondo argomento il numero effetivo che deve sostituire


        for (Integer element : lista) { // utilizzo di un ciclo for each per interare gli LinkedList
            System.out.println(element);
        }

    }


    /*
     * ArrayList vs LinkedList

    Gli ArrayList e le LinkedList hanno differenze significative:

    Accesso: Gli ArrayList consentono un accesso casuale efficiente, mentre le LinkedList sono migliori per inserimenti/rimozioni.

    Inserimenti/Rimozioni: Le LinkedList sono più efficienti per inserimenti/rimozioni frequenti, poiché coinvolgono solo aggiornamenti di riferimenti.

    Memoria: Le LinkedList richiedono più memoria a causa dei riferimenti aggiuntivi, mentre gli ArrayList hanno memoria più compatta.

     */
}
