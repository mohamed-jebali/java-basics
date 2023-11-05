public class WrapperClasses {
    public static void main(String[]args){


        // lista dei dati primitivi a reference 

        // Byte -> byte
        // Short -> short
        // Integer -> int
        // Long -> long
        // Float -> float
        // Double -> double
        // Character -> char
        // Boolean -> boolean


        // la differenza tra i tipi di dati Reference e Primitivi sono: 



        // I tipi primitivi sono più efficienti in termini di memoria e prestazioni.
        // Le classi wrapper forniscono metodi utili per lavorare con dati, ma richiedono più memoria.




        int numero = 44; // tipo di dato primitivo 

        System.out.println("sono un tipo di dato primitivo " + numero);

        // numero.get(); // in questo caso non posso applicare dei metodi  perche' il tipo di dato e' primitivo

        Integer numeroWrapper = 55; // tipo di dato reference oggetto si possono usare i metodi


         System.out.println("sono un tipo di dato Reference " + numeroWrapper); // i tipi di dati reference sono dati primitvi che vengono convertiti in oggetti cosi godono dell proprieta' degli oggeti come i metodo .get() .equals() ecc.. 

        if(numeroWrapper.equals(55)){
            System.out.println("il numero selezionato è: " + numeroWrapper);
        }
        else{
            System.out.println("il numero non corrisponde");
        }


        // per altre info sulle wrapper class e' ecco il link: https://codegrind.it/documentazione/java/classi-wrapper
    }
}
