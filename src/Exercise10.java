import java.util.Scanner;

public class Exercise10 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di righe");

        int InputNumber = input.nextInt();
        

        for (int i = 1; i <= InputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.println();
            }
        }
    
        System.out.println("prova pull request");
    
    
        input.close();

    }
}
