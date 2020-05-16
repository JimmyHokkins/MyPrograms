/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем положительных,
отрицательных и нулевых элементов.
*/

import static java.lang.Math.*;

public class Task3 {    
    public static void main(String[] args) {
        double array[] = new double[15];
        for(int i = 0; i < array.length; i++) {
            array[i] = round((random() * 201 - 100) * 100) / 100.0;
        }        
        System.out.print("Исходный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }
        int positive = 0, negative = 0, nulls = 0;
        for(int i=0; i < array.length; i++) {
            if(array[i] > 0) positive++;
            else if(array[i] < 0) negative++;
            else nulls++;
        }        
        System.out.println("\nЧисло положительных элементов в массиве: " + positive);
        System.out.println("Число отрицательных элементов в массиве: " + negative);
        System.out.println("Число нулевых элементов в массиве: " + nulls);              
    }
}
