public class Task2 {    
    public static void main(String[] args) {
        String sourceString = "this[word]themainlegacy[word]wonder[word]space";
        String replacedWord = "word";
        String newWord = "letter";
        String resultString = "";
        System.out.println("Исходная строка:");
        System.out.println(sourceString);        
        for(int i = 0; i < sourceString.length(); i++) {
            if(sourceString.charAt(i) == replacedWord.charAt(0)) {
                int len = 0;
                for(int j = 0, k = i; j < replacedWord.length(); j++, k++) {
                    if(replacedWord.charAt(j) == sourceString.charAt(k)) len++;                    
                }
                if(len == replacedWord.length()) {
                    resultString += newWord;
                    i += replacedWord.length() - 1;
                }
                else resultString += sourceString.charAt(i);
            }
            else {
                resultString += sourceString.charAt(i);
            }
        }        
        System.out.println("Результирующая строка:");
        System.out.println(resultString);
    }    
}
