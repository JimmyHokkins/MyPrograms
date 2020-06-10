/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма
его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга 
от 1 до k. Для решения задачи использовать декомпозицию.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task14 {    
    public static void main(String[] args) { 
        System.out.print("Введите число k: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Числа Армстронга от 1 до " + k + ": ");        
        for(int i = 1; i <= k; i++) {
            if(checkNumberOfArmstrong(i)) System.out.print(i + "  ");
        }
        System.out.println();
    }
    static boolean checkNumberOfArmstrong(int k) {
        if(sumOfDigits(k) == k) return true;
        return false;            
    }
    static int sumOfDigits(int num) {   // метод, определяющий сумму цифр числа, возведенных в степень, равную количеству цифр в числе
        int sum = 0;
        int temp = num;
        while(num != 0) {
            sum += pow(num % 10, countOfDigits(temp));
            num /= 10;
        }
        return sum;
    }
    static int countOfDigits(int num){  // метод для нахождения количества цифр в числе
        if(num == 0) return 1;
        int count = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }    
}
