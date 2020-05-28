/*
Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
Использовать алгоритм сортировки обменами. Подсчитать количество перестановок.
*/

public class Task4 {    
    public static void main(String[] args) {
        int array[] = new int[15];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 15) + 1;
        }
        System.out.println("Сортировка обменами. Исходный массив: ");
        show(array);        
        int temp, count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }        
        System.out.println("\nРезультирующий массив: ");
        show(array);
        System.out.println("\nЧисло перестановок: " + count);
    }   
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
    }
}
