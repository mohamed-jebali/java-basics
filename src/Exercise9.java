public class Exercise9 {
    public static void main(String[]args){

        for (int i = 1; i <= 100; i++) {
           if(i % 3 == 0 && i % 5 == 0){
            System.out.println("numeri divisibili per entrambi:    " + i);
           }
           else if(i % 3 == 0){
            System.out.println("numeri divisibili per 3:    " + i);
           }
           else if(i % 5 == 0){
            System.out.println("numeri divisibili per 5:    " + i);
           }
        }
    }
}


//scrivi un programma java per stampare numeri da 1 a 100 divisibili per 3,5 e per entrambi