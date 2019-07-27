import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1, sum = 0;
        while(i <= x) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + x + " равна " + sum);
    }
}
