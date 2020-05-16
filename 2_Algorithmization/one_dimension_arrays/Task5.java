/*
Даны целые числа а1, а2, ... , an. Вывести на печать только те числа,
для которых аi > i.
*/

public class Task5 {    
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 21 - 10);
        }        
        System.out.print("Исходный массив: ");
        for(int x : array) {
            System.out.print(x + "  ");
        }       
        System.out.println("\nЧисла в массиве, которые больше своего индекса: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] > i) System.out.println(i + "-й элемент: " + array[i]);
        }
        System.out.println();       
    }
}
