/*
Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {    
    public static void main(String[] args) {
        int S1 = 6, S2 = 10;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        showMatrix(array);
        int max = array[0][0];
        for(int x[] : array) {    // находим максимальный элемент матрицы
            for(int y : x) {
                if(y > max) max = y;
            }
        }
        for(int i = 0; i < S1; i++) {   // заменяем все нечетные элементы матрицы на максимальный
            for(int j = 0; j < S2; j++) {
                if(array[i][j] % 2 != 0) array[i][j] = max;
            }
        }
        System.out.println("Наибольший элемент матрицы: " + max);
        System.out.println("Полученная матрица: ");
        showMatrix(array);
    }
    static void showMatrix(int[][] m) {
        for(int x[] : m) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
