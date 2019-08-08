/*
  Условие задачи:
  В строке вставить после каждого символа 'a' символ 'b'
*/
public class Task2 {    
    public static void main(String[] args) {       
        StringBuilder str = new StringBuilder("fght_a_vbgkfj_a_rhgy_a_mjf_a");
        System.out.println("Исходная строка: " + str);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') str.insert(i + 1, 'b');  // находим в строке символ 'а' и вставляем после него символ 'b'
        }
        System.out.println("Результирующая строка: " + str);
    }    
}
