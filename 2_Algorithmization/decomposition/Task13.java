/*
Два простых числа называются "близнецами", если они отличаются друг от друга
на 2 (например, 41 и 43). Найти и напечатать все пары "близнецов" из отрезка [n, 2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
*/

import java.util.Scanner;

public class Task13 {    
    public static void main(String[] args) { 
        System.out.print("Введите начало отрезка: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Простые числа-близнецы: ");
        printTwins(n);
    }
    static void printTwins(int n) {
        int temp = n;
        for(int i = n; i <= n * 2; i++) {
            if(checkSimple(i) && (i - temp == 2)) 
                System.out.println(temp + " " + i);
            if(checkSimple(i)) temp = i;
        }
    }
    static boolean checkSimple(int num) {  // метод, проверяющий, простое ли число
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
