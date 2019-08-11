public class Task4 {    
    public static void main(String[] args) { 
        String source = "информатика";
        String s1 = source.substring(source.indexOf("т"), source.indexOf("т") + 1);
        String s2 = source.substring(source.indexOf("ор"), source.indexOf("ор") + 2);
        String result = s1 + s2 + s1;
        System.out.println("Получаем из слова 'информатика' слово '" + result + "'");        
    }    
}
