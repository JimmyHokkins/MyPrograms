/*
В массив A[N] занесены натуральные числа. Найти сумму тех чисел, которые кратны данному К.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task1 {    
    public static void main(String[] args) {
        int[] A = new int[15];
        for(int i = 0; i < A.length; i++){
            A[i] = (int)(random() * 15) + 1;
        }
        System.out.println("Исходный массив: ");
        for(int x : A) {
            System.out.print(x + "  ");
        }
        System.out.println();
        int sum = 0, k;
        System.out.print("Укажите число К: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        for(int n : A) {
            if(n % k == 0) sum += n;
        }
        System.out.println("Сумма чисел, кратных К: " + sum);
    }
}
