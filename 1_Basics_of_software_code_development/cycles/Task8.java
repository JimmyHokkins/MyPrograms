import java.util.Scanner;

public class Task8 {    
    public static void main(String[] args) {
        int x, y, rem1, rem2, saveY;
        String nums = "";  // строка для хранения результата
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число (целое, > 0): ");
        x = sc.nextInt();
        System.out.print("Введите второе число (целое, > 0): ");
        y = sc.nextInt();
        saveY = y;        
        System.out.print("Цифры, содержащиеся в обоих числах: ");
        while(x != 0) {  // в этом цикле получаем поочередно все цифры первого числа
            rem1 = x % 10; // получаем очередную цифру первого числа
            while(y != 0) {  // в этом цикле получаем поочередно все цифры второго числа
                rem2 = y % 10;  // получаем очередную цифру второго числа
                if(rem1 == rem2) {  // если цифры совпадают, проверяем была ли уже такая цифра
                    if(!nums.contains(Integer.toString(rem1))) {  // если нет, то добавляем ее в результат
                       nums += rem1;
                       nums += " ";
                    }
                }
                y /= 10; 
            }
            x /= 10;
            y = saveY; // восстанавливаем второе число
        }
        System.out.println(nums);
    }
}
