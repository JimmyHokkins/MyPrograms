/*
Дано натуральное число N. Написать метод (методы) для формирования массива, 
элементами которого являются цифры числа N.
*/

import java.util.Scanner;

public class Task10 {    
    public static void main(String[] args) {        
        System.out.print("Введите натуральное число: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int[] array = getArrayNumbers(numb);
        System.out.println("Массив цифр указанного числа: ");
        for(int x : array) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }
    static int[] getArrayNumbers(int numb) {
        int count = 0;
        int temp = numb;
        while(temp != 0) {   // подсчитываем количество цифр в числе
            temp /= 10;
            count++;
        }
        int[] ar = new int[count];
        for(int i = count - 1; i >= 0; i--) {   // заполняем массив цифрами числа
            ar[i] = numb % 10;
            numb /= 10;
        }
        return ar;
    }
}
