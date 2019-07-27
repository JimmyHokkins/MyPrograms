import java.util.Scanner;
import static java.lang.Math.*;

public class Task5 {    
    public static void main(String[] args) {
        double x, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число х: ");
        x = sc.nextDouble();
        if(x <= 3) {
            f = pow(x, 2) - 3 * x + 9; 
        }
        else {
            f = 1 / (pow(x, 3) + 6);
        }
        System.out.println("Значение функции F(x) = " + f + " при х = " + x);
    }
}
