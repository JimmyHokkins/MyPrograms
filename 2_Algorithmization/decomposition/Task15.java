import java.util.Scanner;
import static java.lang.Math.*;

public class Task15 {    
    public static void main(String[] args) { 
        System.out.print("Введите количество разрядов числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Натуральные числа указанной разрядности, "
                + "\nцифры в которых образуют строго возрастающую последовательность: ");        
        for(int i = (int)pow(10, n - 1), j = 0; i < (int)pow(10, n); i++) {
            if(growingNumber(i)) {
                System.out.print(i + "  ");
                j++;
                if(j % 10 == 0) System.out.println();
            }           
        }
        System.out.println();
    }
    static boolean growingNumber(int num) {
        int temp1, temp2;
        while(num != 0) {
            temp1 = num % 10;
            num /= 10;
            temp2 = num % 10;
            if(temp2 - temp1 >= 0) return false;            
        }
        return true;
    }    
}
