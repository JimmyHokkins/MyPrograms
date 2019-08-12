/*
  Подсчитать, сколько раз среди символов строки встречается буква 'a'
*/

public class Task5 {    
    public static void main(String[] args) { 
        String source = "ghadvfsakgaafbdea";
        System.out.println("Исходная строка: " + source);
        int count = 0;
        for(int i = 0; i < source.length(); i++) {
            if(source.charAt(i) == 'a') count++;
        }
        System.out.println("В строке содержится " + count + " символов 'a'");
    }    
}
