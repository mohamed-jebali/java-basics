public class ArrayExercise {
    public static void main(String[]args){
        int[] arrayNumeri = new int[4]; // definizione size dell'array 

        arrayNumeri[0] = 10; // per impostare il valore dell'array

        arrayNumeri[1] = 20;

        arrayNumeri[2] = 30;

        arrayNumeri[3] = 40;


        int sum = 0;

        for (int i = 0; i < arrayNumeri.length; i++) {
            System.out.println(arrayNumeri[i]); // interazione dell'valore scorrendo l'arrayNumeri 

            sum += arrayNumeri[i]; // faccio la somma dei valori dell' arrayNumeri
        }

        System.out.println("la somma dell'array numerico è : " + sum); // output // 100

        String[] arrayStringhe = {"Easter","Halloween","Christmas"}; // definizione di un array di stringhe in questo la size e' sottoinstesa

        System.out.println(arrayStringhe[1]); // output Hallowen

    }
}
