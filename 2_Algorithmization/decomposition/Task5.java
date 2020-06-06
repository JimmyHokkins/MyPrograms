/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести
на печать число, которое меньше максимального элемента массива, но больше всех остальных
элементов.
*/

import static java.lang.Math.*;

public class Task5 {    
    public static void main(String[] args) {        
        int[] numbs = new int[20];
        for(int i = 0; i < numbs.length; i++){
            numbs[i] = (int)(random() * 20) + 1;
        }
        System.out.println("Исходный массив чисел: ");
        show(numbs);
        System.out.println("\nВторое по величине число в массиве: " + secondMax(numbs));               
    }
    static int secondMax(int[] array) {        
        int max = array[0];
        int secondMax = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max) max = array[i];
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] > secondMax && array[i] < max) secondMax = array[i];
        }        
        return secondMax;
    }    
    static void show(int[] ar) {
        for(int x : ar) {
            System.out.print(x + " ");
        }
    }
}
