import java.util.Scanner;

public class Task17 {    
    public static void main(String[] args) { 
        System.out.print("Введите натуральное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               
        int count = 0;
        while(n != 0) {
            n -= sumOfDigits(n);
            count++;
        }
        System.out.println("Число операций, пока не будет достигнут ноль: " + count);
    }     
    static int sumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
