public class Exercise7 {
    public static void main (String[] args){

        String vegetable = "carrot";

        String word = "who is there?";

        String saluto = "Hello Spiderman";


        System.out.println(word.replaceAll("is|who|there", "goes")); // sostistuice le parole con | si possono selezionare piu di una parola


        System.out.println(vegetable.length()); // length di una variabile

        System.out.println(vegetable.replace('c', 'K')); // sostituisce un char con un altro

        System.out.println(vegetable.replaceAll("carrot", "Kakkarot"));// sostituisce una stringa con un altra


        System.out.println("IndexOf della parola HELLO SPIDERMAN " + saluto.indexOf('n'));// come trovare la posizione della lettera n


        System.out.println(saluto.toUpperCase()); // intera stringa in MAIUSCOLO

        System.out.println(saluto.toLowerCase());  // intera stringa in minuscolo
        
    }
}
