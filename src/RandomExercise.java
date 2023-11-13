import java.lang.Math; // bisogna importare la libreria standard di java per utlizzare il modulo Math
import java.util.Scanner;


public class RandomExercise {
    

    public static void main(String[]args){

        int min = 1; // Il valore minimo del range
        int max = 6; // Il valore massimo del range

        // Genera un numero casuale compreso tra min e max
        int randomNumber = (int) Math.round(Math.random() * (max - min) + min); // dichiaro una variabile randomNumber
                                                                                // faccio il casting altrimenti il dato finale sara' di tipo long per via del metodo che non usa tipi di dati int dopo si arrotonda
                                                                                // uso la funzione Math.round all'interno eseguo un altro metodo
                                                                                // Math.random per i numeri casuali moltiplicando i due range + il minimo perche' di default sarebbe (0, max - min) quindi con il + 
                                                                                // il range parte dal minimo cioe' 1


        // System.out.println("il valore randomico " + randomNumber);

                    Scanner input = new Scanner(System.in);


                    try{
                        System.out.println("Cosa Scegli tra Dispari o Pari??");
            
                        String inputString = input.nextLine();
            
                        while (!(inputString.equalsIgnoreCase("Dispari") || inputString.equalsIgnoreCase("Pari"))) {
                             System.out.println("Errore Inserisci Dispari o Pari");
                             
                             inputString = input.nextLine();
                        }   
                        
                           System.out.println("Hai inserito " + inputString);
    
    
                            if(inputString.equalsIgnoreCase("Dispari") && randomNumber % 2 != 0){
                                System.out.println("Hai Vinto!");
                            }
                            else if(inputString.equalsIgnoreCase("Pari") && randomNumber % 2 == 0){
                                System.out.println("Hai Vinto");
                            }
                            else{
                                System.out.println("Hai Perso");
                            }
                    }
                    finally{
                           input.close();
                    }

    }


    }
