/*
  Посчитать количество строчных и прописных букв в введенной строке. Учитывать только английские буквы.
*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите строку с буквами в разном регистре: ");
        Scanner sc = new Scanner(System.in);
        String sourceString = sc.nextLine();
        int countLowerCase = 0;  // маленькие буквы
        int countUpperCase = 0;  // большие буквы
        int countOther = 0;  // другие символы
        char[] letters = sourceString.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            if((letters[i] >= 65 && letters[i] <= 90) || (letters[i] >= 97 && letters[i] <= 122)) {
                if(Character.isUpperCase(letters[i])) {
                    countUpperCase++;
                }
                else if(Character.isLowerCase(letters[i])){
                    countLowerCase++;
                }
            }
            else {
                countOther++;
            }
        }
        System.out.println("Число строчных букв: " + countLowerCase + ", число прописных букв: " + countUpperCase +
                ", число прочих символов: " + countOther);
    }
}
