import java.util.Scanner;

public class Task2 {    
    public static void main(String[] args) {
        int a, b, c, d, min1, min2;
        char num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа а и b (через пробел): ");
        a = sc.nextInt();        
        b = sc.nextInt();
        if(a > b) {
            System.out.println("Из чисел a и b число b - минимум.");
            min1 = b;
            num1 = 'b';
        }
        else if(b > a) {
            System.out.println("Из чисел a и b число a - минимум.");
            min1 = a;
            num1 = 'a';
        }
        else {
            System.out.println("Числа а и b равны.");
            min1 = a;
            num1 = 'a';
        }        
        System.out.print("Введите числа c и d (через пробел): ");
        c = sc.nextInt();        
        d = sc.nextInt();
        if(c > d) {
            System.out.println("Из чисел c и d число d - минимум.");
            min2 = d;
            num2 = 'd';
        }
        else if(d > c) {
            System.out.println("Из чисел c и d число c - минимум.");
            min2 = c;
            num2 = 'c';
        }
        else {
            System.out.println("Числа c и d равны.");
            min2 = c;
            num2 = 'c';
        }        
        if(min1 > min2) System.out.println("Из чисел " + num1 + " и " + num2 + " число " + num1 + " - максимум.");        
        else if(min2 > min1) System.out.println("Из чисел " + num1 + " и " + num2 + " число " + num2 + " - максимум.");  
        else System.out.println("Нет максимума. Числа равны");
    }    
}
