public class ArrayExercise3 {
    public static void main(String[]args){

        String[] arrayStringhe = {"Elmo","Spada","Scudo","Gambali"};

        String index = arrayStringhe[0];

        for (int i = 0; i < arrayStringhe.length-1; i++) {
            arrayStringhe[i] = arrayStringhe[i + 1];
        }

        arrayStringhe[arrayStringhe.length-1] = index;

        for(String element: arrayStringhe){
            System.out.print(element + " ");
        }


    // output --> Spada,Scudo,Gambali,Elmo



    System.out.println("");


    String[] arraySport = {"Calcio","Basket","Tennis","Pugilato"};

    String last = arraySport[arraySport.length-1];

    for (int j = arraySport.length-1; j > 0; j--) {
        arraySport[j] = arraySport[j -1];
    }

    arraySport[0] = last;

    for(String elementSport: arraySport){
        System.out.print(elementSport + " ");
    }

    // output --> Pugilato, Calcio , Basket , Tennis


    }
}
