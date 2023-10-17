public class App {
    // all'interno dell' codice ci deve essere una funzione main che e' il punto d'entrata da cui il codice inizia
    public static void main(String[] args) throws Exception {
        int x = 4;
        // Java e' un linguaggio che richiede la tipizazzione delle variabili
        // inizializzione e assegnazione variabile uguale a 4 di tipo intero
        int y = 4;
        int z = x + y;

        
        // if else sono a livello di sintassi e' simile a JS
        // per quanto riguarda la visualizzazione del codice in console
        // si usa System.out.println 'println' dice al codice di andare a capo
        // se fosse solo System.out.print il codice in console non va a capo

        if(z % 2 == 0){
            System.out.println("the number is Even");
        }
        else{
            System.out.println("the number is Odd");
        }

        // TIPI DI DATI
        boolean booleanData = true;  // Tipo di dato primitivo booleano: può essere true o false
        byte byteData = 127;          // Tipo di dato primitivo byte: dati da -128 a 127
        int integerNumber = 10;       // Tipo di dato primitivo int: dati da -2 miliardi a 2 miliardi
        short shortNumber = 32767;    // Tipo di dato primitivo short: dati da -32768 a 32767
        long longNumber = 90000000000000000L; // Tipo di dato primitivo long: dati da -9 quintilioni a 9 quintilioni, utilizzare 'L' alla fine per specificare il tipo di dato
        float floatNumber = 5.165656565F; // Tipo di dato primitivo float: consente l'uso di 7 cifre decimali, utilizzare 'F' alla fine per specificare il tipo di dato
        double doubleNumber = 54.4545454;  // Tipo di dato primitivo double: può usare fino a 15 cifre decimali
        char charLetter = 'c';   // Tipo di dato primitivo char: può contenere una singola lettera racchiusa tra virgolette singole
        String stringWord = "hello world"; // String: una classe per rappresentare sequenze di caratteri

        // Stampa il tipo di dato di ciascuna variabile
        System.out.println(booleanData + " è di tipo " + Boolean.TYPE);
        System.out.println(byteData + " è di tipo " + Byte.TYPE);
        System.out.println(integerNumber + " è di tipo " + Integer.TYPE);
        System.out.println(shortNumber + " è di tipo " + Short.TYPE);
        System.out.println(longNumber + " è di tipo " + Long.TYPE);
        System.out.println(floatNumber + " è di tipo " + Float.TYPE);
        System.out.println(doubleNumber + " è di tipo " + Double.TYPE);
        System.out.println(charLetter + " è di tipo " + Character.TYPE);
        System.out.println(stringWord + " è di tipo " + String.class.getName());


        // CASTING

        // CASTING IMPLICITO
        short shortImplicit = 20;
        int intImplicit = shortImplicit; // Casting implicito da short a int

        System.out.println("Valore di shortImplicit: " + shortImplicit);
        System.out.println("Valore di intImplicit (risultante dal casting implicito): " + intImplicit);

        // CASTING ESPERESSO
        int intExplicit = 40000000;
        short shortExplicit = (short) intExplicit; // Casting esplicito da int a short c'e' una perdita di dati dovuta al cambio di tipo ciò può comportare la perdita di informazioni se il valore originale è al di fuori dell'intervallo consentito per un short.

        System.out.println("Valore di intExplicit: " + intExplicit);
        System.out.println("Valore di shortExplicit (risultante dal casting esplicito): " + shortExplicit);

    }
}
