/*
Дана последовательность чисел. Требуется переставить числа так, чтобы они были 
расположены по убыванию. Использовать алгоритм сортировки выбором.
*/

public class Task3 {    
    public static void main(String[] args) {
        int array[] = new int[15];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 15) + 1;
        }
        System.out.println("Сортировка выбором. Исходный массив: ");
        show(array);        
        int i = 0, max;
        int temp, k = 0, f = 0;
        while(i < array.length){
            max = array[i];
            for(int j = i; j < array.length; j++){
                if(array[j] > max) {
                    max = array[j];
                    k = j;
                    f = 1;
                }
            }
            if(f == 1){
                temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
            f = 0;
            i++;            
        }
        System.out.println("\nРезультирующий массив: ");
        show(array);
        System.out.println();
    }   
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
    }
}
