public class Task1 {    
    public static void main(String[] args) {
        String[] namesVars = { "thisBeautifulDay", "theBookOfMagia", "piratesSevenSeas" };
        String[] namesVars2 = new String[namesVars.length];
        for(int i = 0; i < namesVars2.length; i++){
            namesVars2[i] = "";
        }
        System.out.println("Исходный массив строк:");
        for(String str : namesVars) {
            System.out.println(str);
        } 
        for(int i = 0; i < namesVars.length; i++) {
            for(int j = 0; j < namesVars[i].length(); j++){
                if(Character.isUpperCase(namesVars[i].charAt(j)) && j != 0) {
                    namesVars2[i] += "_" + Character.toLowerCase(namesVars[i].charAt(j));                    
                }
                else {
                    namesVars2[i] += namesVars[i].charAt(j);
                }
            }
        }
        System.out.println("\nРезультат:");
        for(String str : namesVars2) {
            System.out.println(str);
        }        
    }    
}
