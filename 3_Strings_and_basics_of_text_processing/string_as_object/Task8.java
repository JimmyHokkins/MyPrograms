/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/

import java.util.Scanner;

public class Task8 {    
    public static void main(String[] args) { 
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();       // считываем строку
        String[] arrayString = source.split("\\s");  // разбиваем строку на слова и помещаем их в массив
        int maxLen = arrayString[0].length();  // сначала самое длинное слово - первое в массиве
        int indexMax = 0;     //  индекс самого длинного слова
        for(int i = 0; i < arrayString.length; i++) {   // перебираем массив слов и 
            if(arrayString[i].length() > maxLen) {     // находим самое длинное слово
                maxLen = arrayString[i].length(); 
                indexMax = i;
            }
        }
        System.out.println("Самое длинное слово в строке: " + arrayString[indexMax]);  // выводим на экран
    }    
}
