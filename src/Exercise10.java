import java.util.Scanner;

public class Exercise10 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di righe");

        int InputNumber = input.nextInt();
        

        for (int i = 1; i <= InputNumber; i++) { // primo for incrementa di 1 l'input dell'utente fino al numero inserito incluso
            for (int k = i; k > 1; k--) { // for innestato decrementa di 1 i numeri prodotti dall utente fino a 1 lo zero e' eslcuso
                System.out.print(k);
            }
             for (int t = 1; t <= i; t++) { // secondo for innestato incrementa di 1 l'input la variabile i prodotta dall'input dell'utente
                                            // si dichiara una variabile t uguale a 1 che e' minore o uguale ad i variabile prodotto dall'utente
                System.out.print(t);
            }

            System.out.println(""); // per ogni iterazione la console va a capo
        }
        ///

        for (int i = InputNumber - 1; i > 0; i--) { // primo for incrementa di 1 l'input dell'utente fino al numero inserito incluso
            for (int k = i; k > 1; k--) { // for innestato decrementa di 1 i numeri prodotti dall utente fino a 1 lo zero e' eslcuso
                System.out.print(k);
            }
             for (int t = 1; t <= i; t++) { // secondo for innestato incrementa di 1 l'input la variabile i prodotta dall'input dell'utente
                                            // si dichiara una variabile t uguale a 1 che e' minore o uguale ad i variabile prodotto dall'utente
                System.out.print(t);
            }

            System.out.println(""); // per ogni iterazione la console va a capo
        }
        ///




    
    
        input.close();

    }
}
