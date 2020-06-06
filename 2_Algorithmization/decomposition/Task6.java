/*
Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

import java.util.Scanner;

public class Task6 {    
    public static void main(String[] args) {
       System.out.print("Введите три числа для проверки (через пробел): ");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int z = sc.nextInt();
       if(checkPrimeNumbers(x, y, z)) System.out.println("Эти числа взаимно простые"); 
       else System.out.println("Эти числа не взаимно простые");
    }
    static boolean checkPrimeNumbers(int x, int y, int z) {
       int[] nums = { x, y, z };
       int small = nums[0];
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] < small) small = nums[i];
       }
       for(int i = 2; i <= small; i++) {
           if((x % i == 0 && y % i == 0) || (x % i == 0 && z % i == 0) || (y % i == 0 && z % i == 0)) {
               return false;
           }
       }
       return true;
    }
}
