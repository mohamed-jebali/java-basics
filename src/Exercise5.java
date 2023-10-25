import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Scrivi la base del triangolo");

        if(input.hasNextInt()){
            int inputBase = input.nextInt();

            System.out.println("Scrivi l'altezza del triangolo");

            int inputAltezza = input.nextInt();

            

            input.close();


         if(inputBase < 0 || inputAltezza < 0){
            System.out.println("I numeri non possono essere negativi");
        }
        else{
            System.out.println("L'area del triangolo è: "+ inputBase * inputAltezza / 2);
        }


        }
        else{
            System.out.println("Errore Non hai inserito un valore numerico");
        }
        }
}



// Esercizio 5

// Scrivi un programma Java che,  dati in input da tastiera due numeri che rappresentano base e altezza, stampi il valore dell'area di un triangolo (base*altezza/2)