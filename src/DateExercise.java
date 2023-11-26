import java.util.Calendar; // import di Calendar
import java.time.LocalDateTime; // import di LocalDateTime
import java.util.Date; // import Date
import java.text.SimpleDateFormat; // import SimpleDateFormat

public class DateExercise {
    
    public static void main(String[]args){


        // primo versione 

        Calendar currentDate = Calendar.getInstance(); // crea una istnaza con il metodo getIstance()

        System.out.println(currentDate.getTime()); // infine si utilizza il metodo per getTime() per viusalizzare a schermo


        // seconda versione

        LocalDateTime currenDateversion2 = LocalDateTime.now(); // si usa l'oggetto LocalDateTime dopo si utlizza la funzione .now()

        System.out.println(currenDateversion2); // infine scrivo a schermo

        // formattazione date

        Date now = new Date(); // un altro sistema per predendere i dati della data attuale
        SimpleDateFormat formatData = new SimpleDateFormat("dd MMM yyyy HH:mm:ss"); // all'interno dell'istanza dell'oggetto SimpleDateFormat scrivo il pattern della formattazione "dd-MMM-yyyy HH:mm:ss"

        System.out.println(formatData.format(now)); // utlizzo la variabile con il pattern scelto e utlizzo il metodo .format in cui inserisco all'interno la data attuale
    }
}
