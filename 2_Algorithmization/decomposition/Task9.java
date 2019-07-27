import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {    
    public static void main(String[] args) {        
        System.out.print("Введите стороны четырехугольника X, Y, Z, T (через пробел): ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println("Площадь четырехугольника: " + squareQuadrangle(x, y, z, t));
    }
    static double squareQuadrangle(double X, double Y, double Z, double T) {  // метод для вычисления площади четырехугольника
        double S = sqrt(pow(X, 2) + pow(Y, 2)); 
        return squareRightTriangle(X, Y) + squareTriangleGeron(Z, T, S); 
    }
    static double squareTriangleGeron(double x, double y, double z) {  // метод для вычисления площади треугольника по формуле Герона
        double p = (x + y + z)/2;
        return sqrt(p * (p - x) * (p - y) * (p - z));
    }
    static double squareRightTriangle(double x, double y) {  // метод для вычисления площади прямоугольного треугольника
        return x * y / 2;
    }    
}
