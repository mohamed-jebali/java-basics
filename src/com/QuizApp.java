package com;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz quanto ne sai sull'Unione Europea??");
        System.out.println("Domanda n. 1) Dove si trova la sede della BCE??");
        System.out.println("A) Strasburgo");
        System.out.println("B) Berlino");
        System.out.println("C) Francoforte");
        char quiz = input.next().charAt(0); 


        if(quiz == 'C' || quiz == 'c'){
            System.out.println("Risposta Corretta!");
        }
        else{
            System.out.println("Risposta Errata");
            input.close();
        }

        System.out.println("Domanda n. 2) Chi è l'attuale presidente della BCE??");
        System.out.println("A) Christine Lagarde");
        System.out.println("B) Mario Draghi");
        System.out.println("C) Jean Claude Trichet");
        char quiz2 = input.next().charAt(0);

          if(quiz2 == 'A' || quiz2 == 'a'){
            System.out.println("Risposta Corretta!");
        }
        else{
            System.out.println("Risposta Errata");
            input.close();
        }



        System.out.println("Domanda n. 3) Chi è l'attuale presidente della Commissione Europea??");
        System.out.println("A) Ursula Von Der Leyen");
        System.out.println("B) Charles Michelle");
        System.out.println("C) Roberta Metsola");
        char quiz3 = input.next().charAt(0);

          if(quiz3 == 'A' || quiz3 == 'a'){
            System.out.println("Risposta Corretta!");
        }
        else{
            System.out.println("Risposta Errata");
            input.close();
        }

        System.out.println("Domanda n. 4) Qual' è il significato della bandiera dell' UE??");
        System.out.println("A) le 12 stelle significano i dodici membri appartenenti all'unione");
        System.out.println("B) le stelle rappresentano gli'ideali di unita' solidarieta' e armonia tra i popoli dell'unione");
        System.out.println("C) le stelle rappresentano gli stati fondatori dell'unione");
        char quiz4 = input.next().charAt(0);

          if(quiz4 == 'B' || quiz4 == 'b'){
            System.out.println("Risposta Corretta!");
        }
        else{
            System.out.println("Risposta Errata");
            input.close();
        }

        System.out.println("Domanda n. 5) Chi ha detto la famosa frase Whatever it takes??");
        System.out.println("A) David Sassoli");
        System.out.println("B) Ursula Von Der Leyen");
        System.out.println("C) Mario Draghi");
        char quiz5 = input.next().charAt(0);

          if(quiz5 == 'C' || quiz5 == 'c'){
            System.out.println("Risposta Corretta!");
            System.out.println("Hai risposto correttamente a tutte le domande!");
        }
        else{
            System.out.println("Risposta Errata");
            input.close();
        }

    }
}
