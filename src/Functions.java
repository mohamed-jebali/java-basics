public class Functions {
    
    public static void main(String[]args){


        Saluto("Java!");

        System.out.println("il risultato dell'addizione: " + addizione(5,5));

        int[] numeri = {1,2,3,4,5,1,19,90};

        double resultMediaArray  = Media(numeri);

        System.out.println("la media dell'array: " + resultMediaArray);

    }


    // le funzioni o metodi devono essere dichiarate fuori dalla funzione main per essere utilizzate 


        static void Saluto(String subject){ // come argomento la funzione accetta solo dati di tipo stringa
            System.out.println("Hello " + subject); // questa funzione non torna un tipo di dato ma ritorna void
        }

        static int addizione(int argA, int argB){ // questa metodo o funzione torna un tipo tipo di dato int e ha due argomenti per la somma 
            return argA + argB;
        }

        static double Media(int[] arrayNumeri){

            int sum = 0;
            for (int i = 0; i < arrayNumeri.length; i++) {
                sum += arrayNumeri[i];
            }
            int resultMedia = sum / arrayNumeri.length;
            return resultMedia;
        }

}
