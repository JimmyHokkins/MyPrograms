/* 
Найдите значение функции: z = ((a - 3) * b / 2) + c
*/

import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Введите числа a, b и c (через пробел): ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.println("Значение функции z = ((a - 3) * b / 2) + c = " + (((a - 3) * b / 2) + c));
    }    
}
