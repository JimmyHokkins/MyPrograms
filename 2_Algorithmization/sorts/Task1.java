/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k и k+1 элементами первого массива, при этом не используя
дополнительный массив
*/

import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        int SIZE1 = 10;
        int SIZE2 = 5;
        int array[] = new int[SIZE1];
        int array2[] = new int[SIZE2];
        int k;        
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1;
        }
        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 10 - 11);
        }
        System.out.println("Первый массив: ");
        show(array);
        System.out.println("\nВторой массив: ");
        show(array2);        
        System.out.print("\nУкажите число k (от 0 до " + (SIZE1 - 1) + "): ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();        
        int array3[] = new int[SIZE1 + SIZE2];
        for(int i = 0; i <= k; i++) {
            array3[i] = array[i];
        }
        for(int j = 0; j < array2.length; j++) {
            array3[k + 1 + j] = array2[j];
        }
        for(int t = k + 1 + array2.length, f = 0; t < array3.length; t++, f++){
            array3[t] = array[k + 1 + f];
        }        
        System.out.println("Результирующий массив: ");
        show(array3);
        System.out.println();
    }
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
    }
}
