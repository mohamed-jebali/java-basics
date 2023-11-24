import java.util.ArrayList;


public class Functions {
    
    // le funzioni o metodi devono essere dichiarate fuori dalla funzione main per essere utilizzate 
    // in questo caso utlizzo una classe functions dopo la posso importare all'interno di altri file


        String Saluto(String subject){ // come argomento la funzione accetta solo dati di tipo stringa
                                       // questa funzione non torna un tipo di dato Stringa
            return  "Hello " + subject; 
        }

        protected int addizione(int argA, int argB,int argC,int argD){ // questa metodo o funzione torna un tipo tipo di dato int e ha due argomenti per la somma 
            return argA + argB + argC + argD;
        }

        protected double getMedia(ArrayList<Integer> arrayNumeri){

            int sum = 0;
            for (int i = 0; i < arrayNumeri.size(); i++) {
                sum += arrayNumeri.get(i);
            }
            double resultMedia = sum / arrayNumeri.size();
            return resultMedia;
        }

}
