public class Task1 {    
    public static void main(String[] args) {
        String sourceString = "ghgh  kj   jhg uuu     oiiuu   mjjh";
        System.out.println("Исходная строка: " + sourceString);
        int max = 0;
        int count = 0;
        for(int i = 0; i < sourceString.length(); i++) {
            if(sourceString.charAt(i) == ' ') {
                while(i < sourceString.length() && sourceString.charAt(i) == ' ') {
                    i++;
                    count++;
                }                               
            }
            if(count > max) max = count;
            count = 0; 
        }
        System.out.println("Максимальное количество пробелов равно: " + max);
    }    
}
