public class Task3 {    
    public static void main(String[] args) {
        String sourceString = "fhgjt67bng-87fjdh32ghjk541re5";
        System.out.println("Исходная строка:  " + sourceString);        
        int count = 0;
        for(int i = 0; i < sourceString.length(); i++) {
            if(Character.isDigit(sourceString.charAt(i))) count++;
        }
        System.out.println("Количество цифр в строке:  " + count);
    }    
}
