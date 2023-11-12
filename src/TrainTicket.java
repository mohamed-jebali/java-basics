import java.util.Scanner;
import java.text.DecimalFormat; // importare il pachetto decimal format per arrotondare la cifra

public class TrainTicket {
    

    public static void main(String[]args){
    	

        Scanner input = new Scanner(System.in);

        double tariffaKilometri = 0.23;

        double discount = 0;

        double distance = 0;

        System.out.println("Inserisci la tua destinazione: Milano, Roma , Venezia , Firenze");

        String destination = input.nextLine();



        
        if(!(destination.equalsIgnoreCase("Milano") || destination.equalsIgnoreCase("Roma") || destination.equalsIgnoreCase("Venezia") || destination.equalsIgnoreCase("Firenze"))){
            System.out.println("La destinazione che hai inserito non è disponibile");
        }


        else{
            if(destination.equalsIgnoreCase("Milano")){
               distance = tariffaKilometri * 320;
            }
            else if(destination.equalsIgnoreCase("Roma")){
                distance = tariffaKilometri * 400;
            }
            else if(destination.equalsIgnoreCase("Venezia")){
                 distance = tariffaKilometri * 262;
            }
            else if(destination.equalsIgnoreCase("Firenze")){
                 distance = tariffaKilometri * 162;
            }


        
        double price = 0;



       System.out.println("Inserisci la tua eta'");

        int inputAge = input.nextInt();

        if(inputAge < 18){
            discount = distance * 0.20;
            price = distance - discount;
        }
        else if(inputAge > 65){
            discount = distance * 0.25;
            price = distance - discount;
        }
        else{
            price = distance;
        }

       DecimalFormat decimalFormat = new DecimalFormat("#.00"); // per formattare il prezzo in due numeri decimali creo un oggetto DecimalFormat --> new DecimalFormat("numero_prima_della_virgola,numeri_decimali")

       String roundedNumber = decimalFormat.format(price); // utilizzo la variabile price nella funzione .format


       if(inputAge < 18){
            System.out.println("è stato applicato uno sconto del 20 % Ecco il prezzo del tuo biglietto: " + roundedNumber + " €");
       }
       else if(inputAge > 65){
         System.out.println("è stato applicato uno sconto del 25 % Ecco il prezzo del tuo biglietto: " + roundedNumber + " €");
       }
       else{
           System.out.println("Ecco il prezzo del tuo biglietto: " + roundedNumber + " €");
       }




        input.close();
        
    }
        
    }
}


// under 65 25% di sconto

// under 18 20% di sconto

// 0.23 cent per kilometro