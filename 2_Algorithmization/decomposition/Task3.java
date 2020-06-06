/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод
вычисления площади треугольника.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер стороны правильного шестиугольника: ");
        int a = sc.nextInt();       
        System.out.println("Площадь шестиугольника: " + squareSix(a));                
    }
    static double squareSix(int x) {        
        return 6 * sqrt(3)/4 * pow(x, 2);
    }   
}
