import java.util.Scanner;


public class Exercise8 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Chi il vero figlio del Signore??");

        String inputUser = input.nextLine();

        while (!(inputUser.equalsIgnoreCase("gesu cristo"))) { // ciclo while una condizione per cui per uscirne deve essere uguale alla parola gesu cristo se la parola non e' corretta il ciclo chiede anche ancora di inserire un input
            if((inputUser.equals("Gesu")) || (inputUser.equals("gesu")) ){
                System.out.println("Figliolo sei sulla retta via");
            }
            else if(inputUser.equals("Diavolo") || inputUser.equals("Lucifero")){
                System.out.println("Figliolo non cedere al Diavolo");
            }
            else{
                 System.out.println("Blasfemia! Riprova");
            }
            inputUser = input.nextLine();
        }

        System.out.println("L'unico figlio di Dio!");


        input.close();

    }
}
