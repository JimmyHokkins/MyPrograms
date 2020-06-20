/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
заменить на одиночные пробелы. Крайние пробелы в строке удалить.
*/

public class Task5 {    
    public static void main(String[] args) {
        String sourceString = "___kghf_____ffgg__dfreew_____loov_wer___"; // пробелы заменены на подчеркивания для наглядности
        String resultString = "";
        System.out.println("Исходная строка:  " + sourceString);        
        
        String symb;
        for(int i = 0; i < sourceString.length(); i++) {
            if(sourceString.charAt(i) == '_'){               
                int j = i;
                while(i < sourceString.length() && sourceString.charAt(i) == '_') i++;
                if(i == sourceString.length() || j == 0) symb = "";
                else symb = "_";
                resultString += symb;                
            }
            if(i < sourceString.length()) resultString += sourceString.charAt(i);
        }
        System.out.println("Результирующая строка:" + resultString);
    }    
}
