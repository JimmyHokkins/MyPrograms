/*
В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца
поставить на соответствующие им позиции другого, а элементы второго столбца переместить 
в первый. Номера столбцов вводит пользователь с клавиатуры.
*/

import java.util.Scanner;

public class Task8 {    
    public static void main(String[] args) {
        int S1 = 5, S2 = 10;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        showMatrix(array);
        System.out.print("Укажите 2 столбца, которые нужно поменять местами (от 1 до " + S2 + " через пробел): ");
        Scanner sc = new Scanner(System.in);
        int t, v, temp;
        t = sc.nextInt() - 1;
        v = sc.nextInt() - 1;
        for(int i = 0; i < S1; i++) {
            temp = array[i][t];
            array[i][t] = array[i][v];
            array[i][v] = temp;
        }       
        System.out.println("Результирующая матрица: ");
        showMatrix(array);   
    }
    static void showMatrix(int[][] matrix) {
        for(int x[] : matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }   
    }
}
