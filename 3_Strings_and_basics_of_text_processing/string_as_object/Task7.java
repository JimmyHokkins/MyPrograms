/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если
введено "abc cde def", то должно быть выведено "abcdef"
*/

import java.util.Scanner;

public class Task7 {    
    public static void main(String[] args) { 
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            if(result.indexOf(source.substring(i, i + 1)) == -1 && source.charAt(i) != ' ') 
                result.append(source.charAt(i));
        }
        System.out.println("Результирующая строка: " + result);
    }    
}
