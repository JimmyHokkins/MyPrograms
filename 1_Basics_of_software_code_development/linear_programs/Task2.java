import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {    
    public static void main(String[] args) {
        double a, b, c, z;
        System.out.print("Введите числа a, b и с (через пробел): ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        z = b + sqrt(pow(b, 2) + 4 * a * c);
        z /= 2 * a;
        z -= pow(a, 3) * c;
        z += pow(b, -2);
        System.out.println("Значение выражения z = " + z);
    }    
}
