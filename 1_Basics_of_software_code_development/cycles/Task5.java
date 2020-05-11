/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
больше или равен заданному е. Общий член ряда имеет вид:
an = (1 / 2^n) + (1 / 3^n)
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task5 {    
    public static void main(String[] args) {
        int n;
        double e, an, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество членов ряда n: ");        
        n = sc.nextInt();
        System.out.print("Введите число e: ");        
        e = sc.nextDouble();
        for(int i = 1; i <= n; i++) {
            an = 1 / pow(2, i) + 1 / pow(3, i);
            if(an >= e) sum += an;
        }
        System.out.println("Сумма членов ряда, которые равны или больше числа е:  " + sum);
    }    
}
