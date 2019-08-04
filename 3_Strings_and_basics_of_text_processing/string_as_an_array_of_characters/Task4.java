public class Task4 {    
    public static void main(String[] args) {
        String sourceString = "f2345hgjt67bng-87fjdh32ghjk541re52tryyy8";
        System.out.println("Исходная строка:  " + sourceString);        
        int count = 0;
        for(int i = 0; i < sourceString.length(); i++) {
            if(Character.isDigit(sourceString.charAt(i))) {
                count++;
                while(i < sourceString.length() && Character.isDigit(sourceString.charAt(i))) i++;
            }
        }
        System.out.println("Количество чисел в строке:  " + count);
    }    
}
