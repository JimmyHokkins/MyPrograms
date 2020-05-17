/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

import java.util.Scanner;

public class Task3 {    
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
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите строку, которую нужно вывести (от 1 до " + S1 + "): ");
        row = sc.nextInt();
        System.out.print("Укажите столбец, который нужно вывести (от 1 до " + S2 + "): ");
        col = sc.nextInt();        
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                if(i == (row - 1)) {
                    System.out.print(array[i][j] + " ");
                }
                else if(j == (col - 1)) {
                    System.out.print(array[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }       
    }
}
