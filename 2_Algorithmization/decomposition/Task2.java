/*
Написать метод для нахождения наибольшего общего делителя четырех
натуральных чисел.
*/

import java.util.Scanner;

public class Task2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четыре натуральных числа (через пробел): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();        
        System.out.println("Наибольший общий делитель для них: " + nod(a, b, c, d));                
    }
    static int nod(int w, int x, int y, int z) {
        int[] numbs = { w, x, y, z };
        int small = numbs[0];
        for(int i = 0; i < numbs.length; i++){
            if(numbs[i] < small) small = numbs[i];            
        }
        int divider = 1;        
        for(int i = 2; i <= small; i++) {
            if(w % i == 0 && x % i == 0 && y % i == 0 && z % i == 0) divider = i;
        }
        return divider;
    }   
}
