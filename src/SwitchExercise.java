import java.util.Scanner;

public class SwitchExercise {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Che giorno e' oggi??");

        int inputUser = input.nextInt();




        switch (inputUser) {
            case 2:
            System.out.println("Sbagliato ma ci sei quasi");
            break;

            case 3:
             System.out.println("Esatto Bravo!");
             break;

            case 4:
             System.out.println("Sbagliato ma ci sei andato vicino");
             break;
        
            default: // simile al else si verifica quando non ci sono i case precedenti
              System.out.println("Sbagliato riprova");
                break;
        }


        for (int i = 1; i < 10; i++) {
            if(i % 2 == 0){
                continue; // continue salta l'iterazione 
            }
            if(i == 5){
                break; // interrompe l'interazione
            }

            System.out.println(i);
        }



        input.close();
    }
}
