/*
Вывести на экран соответствия между символами и их численными обозначениями 
в памяти компьютера
*/

public class Task6 {    
    public static void main(String[] args) throws java.io.IOException {
        int ch, ch1;         
        do {
            System.out.print("Введите любой символ (0 - для выхода): ");
            ch = System.in.read();
            System.out.println("Числовой код данного символа: " + ch);
            do {
                ch1 = System.in.read(); // считываем оставшуюся во входном потоке информацию для его очистки
            } while(ch1 != '\n');   
        } while(ch != '0');
    }
}
