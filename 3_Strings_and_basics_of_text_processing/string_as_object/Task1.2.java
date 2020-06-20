/*
Дан текст (строка). Найдите наибольшее количество подряд идущих
пробелов в нем.
*/

public class Task1 {    
    public static void main(String[] args) {
        String sourceString = "ghgh   kjjhg   uuuo     iiuu mjjh";
        System.out.println("Исходная строка: " + sourceString);
        int max = 0;
        int count = 0;
        int fromIndex = 0;        
        while(fromIndex != -1) {            
            fromIndex = sourceString.indexOf(' ', fromIndex);
            if(fromIndex != -1) {
                while(fromIndex < sourceString.length() && sourceString.charAt(fromIndex) == ' ') {
                    fromIndex++;
                    count++;
                }
            }
            if(count > max) max = count;
            count = 0;
        }         
        System.out.println("Максимальное количество пробелов равно: " + max);
    }    
}
