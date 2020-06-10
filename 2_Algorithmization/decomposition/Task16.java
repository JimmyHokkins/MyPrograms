/*
Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные
цифры. Определить также, сколько четных чисел в найденной сумме. Для решения
задачи использовать декомпозицию.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task16 {    
    public static void main(String[] args) { 
        System.out.print("Введите количество разрядов числа: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               
        int sum = 0;
        for(int i = (int)pow(10, n - 1); i < (int)pow(10, n); i++) {
            if(oddNumber(i)) sum += i;
        }
        System.out.println("Сумма чисел указанной разрядности, содержащих только нечетные цифры: " + sum);        
        System.out.println("Количество четных цифр в найденной сумме: " + countOfEvenNumbers(sum)); 
    }     
    static boolean oddNumber(int num){
        while(num != 0) {
            if(num % 2 == 0) return false;
            num /= 10;
        }
        return true;
    }
    static int countOfEvenNumbers(int num) {  // метод для нахождения количества четных цифр в числе
        int count = 0;
        while(num != 0) {
            if(num % 2 == 0) count++;
            num /= 10;
        }
        return count;
    }
}
