import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {    
    public static void main(String[] args) {
        double x, y, z;
        System.out.print("Введите числа x и y (через пробел): ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sin(x) + cos(y);
        z /= cos(x) - sin(y);
        z *= tan(x * y);
        System.out.println("Значение выражения z = " + z);
    }    
}
