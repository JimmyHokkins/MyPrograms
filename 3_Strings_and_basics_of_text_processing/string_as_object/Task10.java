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
        char[] letters = sourceString.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            if(Character.isUpperCase(letters[i])) {
                int j = i - 1;
                if (j < 0) countPhrase++;
                else {
                    while (j >= 0 && letters[j] == ' ') j--;
                    if (j < 0 || letters[j] == '.' || letters[j] == '!' || letters[j] == '?') {
                        countPhrase++;
                    }
                }
            }
        }
        System.out.println("Число предложений в тексте: " + countPhrase);
    }
}
