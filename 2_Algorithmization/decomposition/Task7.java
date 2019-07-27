import java.util.Scanner;
import static java.lang.Math.*;

public class Task8 {    
    public static void main(String[] args) {        
        int[] D = new int[10];
        for(int i = 0; i < D.length; i++) {
            D[i] = (int)(random() * 10) + 1;
        }
        System.out.println("Исходный массив: ");
        for(int x : D) {
            System.out.print(x + " ");
        }
        System.out.print("\nВведите число k (от 1 до " + (D.length - 2) + "): ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Сумма трех последовательных элементов, начиная с " + k + "-го, равна: " + sumThree(D, k - 1));
    }
    static int sumThree(int[] D, int k) {
        int sum = 0;
        if(k + 3 <= D.length){            
            for(int i = k; i < k + 3; i++) sum += D[i];          
        }
        return sum;
    }
}
