/*
Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
Подсчитать число предложений в строке.
*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите текст из нескольких предложений: ");
        Scanner sc = new Scanner(System.in);
        String sourceString = sc.nextLine();
        int countPhrase = 0;  // число предложений
        String[] phrases = sourceString.split("[.!?]");
        for(String phrase : phrases) {
            if(phrase.length() != 0) countPhrase++;
        }
        System.out.println("Число предложений в тексте: " + countPhrase);
    }
}


