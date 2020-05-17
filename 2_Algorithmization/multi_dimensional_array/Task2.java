/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
*/

public class Task2 {    
    public static void main(String[] args) {
        int S = 5;
        int array[][] = new int[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Элементы, стоящие по диагонали: ");
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                if(j == i) System.out.print(array[i][j] + " ");
            }
        }         
        System.out.println();      
    }
}
