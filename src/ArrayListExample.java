import java.util.ArrayList; // importare ArrayList


public class ArrayListExample {


    // per la documentazione per il funzionamento dell'array list ecco il link: https://codegrind.it/documentazione/java/arraylist
    
    public static void main(String[]args){
        ArrayList<Integer> listaNumeri = new ArrayList<>(); // per la tipizazzione si usano tipi di dati reference poi si crea un istanza inizializzando una variabile

        listaNumeri.add(12);
        listaNumeri.add(66);
        listaNumeri.add(90);
        listaNumeri.add(102);
        listaNumeri.add(99); // metodo per aggiungere un elemento all'interno dell'array
        listaNumeri.remove(2); // metodo per togliere un elemento dall'array
        listaNumeri.set(1,98); // metodo per modificare un elemento nella posizione scelta set('posizione di riferimento','elemento da sostituire')
        // listaNumeri.clear(); // metodo per cancellare tutti gli elementi dell'array


        System.out.println("metodo get per prendere l'elemento nella posizione 0: " + listaNumeri.get(0));
        
        System.out.println("la lunghezza dell'array e' " + listaNumeri.size()); // metodo per prendere la lughezza dell'array non si usa length perche' e un  tipo di dato reference

        boolean containsNumber = false;

        for (int i = 0; i < listaNumeri.size(); i++) { // in questo ciclo for bisogna usare il metodo size dato che ArrayList e un tipo di dato ArrayList
            if(listaNumeri.contains(102)){
                containsNumber = true;
            }
        }

        if(containsNumber == true){
             System.out.println("Hai trovato il numero " + listaNumeri.get(2));
        }else{
            System.out.println("Non e' presente il numero richiesto nell'array");
        }


        for(int element :listaNumeri){
            System.out.print(element + " "); // per ciclare un array e vederlo a schermo si usa un ciclo foreach
        }
    }
}
