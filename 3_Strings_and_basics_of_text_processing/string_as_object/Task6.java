/*
  Из заданной строки получить новую, повторив каждый символ дважды
*/
public class Task6 {    
    public static void main(String[] args) { 
        String source = "abracadabra";        
        System.out.println("Исходная строка: " + source);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            result.append(source.charAt(i));
            result.append(source.charAt(i));
        }
        System.out.println("Результирующая строка: " + result);
    }    
}
