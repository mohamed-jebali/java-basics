import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class CircleExercise {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        Scanner inputType = new Scanner(System.in);

        try{
            System.out.println("Calcola i dati dell cerchio Inserisci il dato del raggio");

            int raggio = input.nextInt();

            System.out.println("Quale dato hai bisogno?? Area o Perimetro??");

            String inputString = inputType.nextLine();

            while(!(inputString.equalsIgnoreCase("Area") || inputString.equalsIgnoreCase("Perimetro"))){
                System.out.println("Errore inserisci Area o Perimetro");

                inputString = inputType.nextLine();
            }

                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                double result = 0;

                if(inputString.equalsIgnoreCase("Area")){
                    result = Math.PI * Math.pow(raggio, 2);
                    String roundedNumber = decimalFormat.format(result);
                    System.out.println("il risultato è  uguale a: " + roundedNumber);
                }
                else if (inputString.equalsIgnoreCase("Perimetro")){
                    result = (2 * Math.PI) * raggio;
                    String roundedNumber = decimalFormat.format(result);
                    System.out.println("il risultato è uguale a: " + roundedNumber);
                }

        }
        catch(InputMismatchException error){
            System.out.println("Errore Inserisci un valore Valido");
        }
        finally{
            input.close();
            inputType.close();
        }


    }
}
