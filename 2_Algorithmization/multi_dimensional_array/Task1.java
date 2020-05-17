/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
элемент больше последнего.
*/

public class Task1 {    
    public static void main(String[] args) {
        int S1 = 5, S2 = 10;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
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
        int range[] = new int[S2];
        int count = 0;        
        for(int i = 0; i < S2; i++) {
            if(array[0][i] > array[S1-1][i] && i % 2 == 0) {
                range[count++] = i;
            }
        }
        System.out.println("Нечетные столбцы, в которых первый элемент больше последнего: ");
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                for(int k = 0; k < count; k++) {
                    if(j == range[k]) System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();        
    }
}
