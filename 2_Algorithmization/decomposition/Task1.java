/*
Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
двух натуральных чисел.
*/

import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое натуральное число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int b = sc.nextInt();        
        System.out.println("Наибольший общий делитель: " + nod(a, b));
        System.out.println("Наименьшее общее кратное: " + nok(a, b));        
    }
    static int nod(int x, int y) {
        if(x == y) return x;
        int small, big, divider = 1;
        small = x < y? x : y;
        big = x > y? x : y;
        for(int i = 1; i <= small; i++) {
            if(small % i == 0 && big % i == 0) divider = i;
        }
        return divider;
    }
    static int nok(int x, int y) {
        if(x == y) return x;
        int small, big; 
        small = x < y? x : y;
        big = x > y? x : y;
        int multiple = big;
        while(multiple % small != 0 || multiple % big != 0) {
            multiple += big;
        }
        return multiple;
    }
}
