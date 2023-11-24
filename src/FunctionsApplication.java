import java.util.Scanner;
import java.util.InputMismatchException; // importo inputMismatch per avere l'exception
import java.util.ArrayList;
import java.text.DecimalFormat;


public class FunctionsApplication {
    

    public static void main (String[]args){

        Functions funzioneAddizione = new Functions(); // prima di usare le fuzioni inserisco l'oggetto e' istanzio Functions dichiarando una variabile

        Functions fuzioneMedia = new Functions();

        Scanner inputAddizione = new Scanner(System.in);

        ArrayList<Integer> listaArray = new ArrayList<Integer>();



        try{ // gestione dell'errore con le exception
            
                    System.out.println("Inserisci il primo numero");
            
                    int numero1 = inputAddizione.nextInt();
        
        
                    System.out.println("Inserisci il secondo numero");
        
        
                    int numero2 = inputAddizione.nextInt();

                    System.out.println("Inserisci il terzo numero");
        
        
                    int numero3 = inputAddizione.nextInt();

                    System.out.println("Inserisci il quarto numero");
        
        
                    int numero4 = inputAddizione.nextInt();
        
                    int result = funzioneAddizione.addizione(numero1, numero2,numero3,numero4); // riutlizzo la variabile istanziata con il . accedo ai metodi

                    System.out.println("il risultato dell'addizione e': " + result);


                    listaArray.add(numero1);
                    listaArray.add(numero2);
                    listaArray.add(numero3);
                    listaArray.add(numero4);

                    // for (Integer element : listaArray) {
                    //     System.out.println("dati array: " + element);
                    // }


                    double resultMedia = fuzioneMedia.getMedia(listaArray);

                    DecimalFormat decimalFormat = new DecimalFormat("#.##");


                    String roundedResult = decimalFormat.format(resultMedia);

                    
                    System.out.println("il risultato media e': " + roundedResult);
                    
        }
        catch(InputMismatchException error){ // catturo l'errore di incompatibilita' di tipo di dato in errore dall'input 
            System.out.println("Inserisci un valore valido"); // output in caso di expection
        }

        finally{
            inputAddizione.close(); // infine chiudo l'input
        }




    }
}
