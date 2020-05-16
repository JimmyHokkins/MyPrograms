/*
Дана последовательность действительных чисел а1, а2, ... , аn. Заменить все ее члены, 
большие данного Z, этим числом. Подсчитать количество замен.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {    
    public static void main(String[] args) {
        double array[] = new double[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = round((random() * 201 - 100) * 100) / 100.0;     // заполняем массив случайными числами
        }
        System.out.print("Исходный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите число Z: ");
        double z = sc.nextDouble();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > z) {
                array[i] = z;
                count++;
            }
        }        
        System.out.print("Преобразованный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }
        System.out.println("\nЧисло замен: " + count);       
    }
}
