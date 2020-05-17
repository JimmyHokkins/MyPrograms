/*
Отсортировать столбцы матрицы по возрастанию и убыванию элементов.
*/

public class Task13 {    
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
        int temp;
        for(int j = 0; j < S2; j++) {
            for(int i = 0; i < S1; i++) {
                for(int k = 0; k < (S1 - i - 1); k++) {
                    if(array[k][j] > array[k + 1][j]) {
                        temp = array[k][j];
                        array[k][j] = array[k + 1][j];
                        array[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица с отсортированными по возрастанию столбцами: ");
        showMatrix(array);
        for(int j = 0; j < S2; j++) {
            for(int i = 0; i < S1; i++) {
                for(int k = 0; k < (S1 - i - 1); k++) {
                    if(array[k][j] < array[k + 1][j]) {
                        temp = array[k][j];
                        array[k][j] = array[k + 1][j];
                        array[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица с отсортированными по убыванию столбцами: ");
        showMatrix(array);        
    }    
    // метод для вывода 
    static void showMatrix(int a[][]) {
        for(int x[] : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
