import java.util.HashMap;

public class HashMapExercise {
    
    public static void main(String[]args){

        HashMap<String,Integer> arrayHash = new HashMap<String,Integer>(); // HashMap con due valori tipizzati dopo 
                                                                           // i valori sono studiati in base alla logica
                                                                           // chiave valore  "chiave" : "valore"


        arrayHash.put("ID", 1); // il metodo put inserisce i dati all'interno dell'HashMap
        arrayHash.put("Password", 12345678); // i tipi di dati consentiti sono String e int
        arrayHash.put("ISBN", 212134567);


        for (String element : arrayHash.keySet()) { // infine per visualizzare a schermo l'output si usa un ciclo forEach
            int dati = arrayHash.get(element);

            System.out.println(element + " : " + dati);
        }

    }
}
