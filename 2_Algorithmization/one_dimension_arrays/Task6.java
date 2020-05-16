/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые
номера которых являются простыми числами.
*/

import static java.lang.Math.*;

public class Task6 {    
    public static void main(String[] args) {
        double array[] = new double[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = round((random() * 21 - 10) * 100) / 100.0;
        }        
        System.out.print("Исходный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }        
        double sum = 0;       
        for(int i = 0; i < array.length; i++) {
            int t = 0;
            for(int j = 2; j <= i/2; j++) { // определяем, является ли индекс простым числом
                if(i % j == 0) {
                    t++;
                    break;
                }
            }            
            if(t == 0 && i > 1) sum += array[i];            
        }
        System.out.println("\nСумма чисел, порядковые номера которых в массиве являются простыми числами: " + sum);       
    }
}
