import java.time.LocalDate; // importazione libreria LocalDate per lavorare con le date

public class ChallengeThree {
    public static String dayOfWeek(String date) {
        /**
         * Returns a String storing the day of the week in all capital letters of the
         * given date String
         * Complete the implementation of the DateUtil class and use it in this function 
         * Arguments
         * date - a String storing a local date, such as "2000-01-01" 
         * Examples
         * dayOfWeek("2000-01-01") returns "SATURDAY"
         */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code to return the day of the week of the String date
        //        using the DateUtil class at the bottom of this file

        DateUtil dateUtil = new DateUtil(date); // utlizzo la classe DateUtil creando un instanza con argomento date guarda sotto
        return dateUtil.dayOfWeek(); // utilizzo la funzione dayOfWeek() che ho creato per fare la conversione guarda sotto
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        String theDayOfWeek = dayOfWeek("2000-01-01");
        String expected = "SATURDAY";
        // Expected output is 
        // true
        System.out.println(theDayOfWeek == expected);
    }
}

class DateUtil {
    LocalDate DateDayWeek; // campo Date

    public DateUtil(String date) { // funzione come argomento date
        /**
         * Initialize the theDate field using the String date argument
         * Arguments
         * date - a String storing a local date, such as "2000-01-01" 
         */

        // ====================================
        // Do not change the code before this
    
        // CODE2: Write code to initialize the date field of the class

        
        this.DateDayWeek = LocalDate.parse(date);  // prendo il campo di tipo LocalDate e lo converto con la funzione .parse per convertirla da stringa a LocalDate

        System.out.println(DateDayWeek.getClass().getName()); // verifico il tipo di dato che sia LocalDate
        
    
        // ====================================
        // Do not change the code after this
    }

    public String dayOfWeek() {
        /**
         * Return a String the day of the week represented by theDate
         */

        // ====================================
        // Do not change the code before this
    
        // CODE3: Write code to return the String day of the week of theDate


        DateDayWeek.getDayOfWeek().toString().toUpperCase(); // converto la data in stringa poi un 'altra conversione con le lettere in maiuscolo

        System.out.println(this.DateDayWeek.getDayOfWeek()); // metto a schermo il nome del giorno che sara' SATURDAY

        return this.DateDayWeek.getDayOfWeek().toString(); // conversione in stringa perche' la funzione deve tornare un tipo stringa

        
    
        // ====================================
        // Do not change the code after this
    }
}