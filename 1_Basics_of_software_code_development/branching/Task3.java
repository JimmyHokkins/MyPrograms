import java.util.Scanner;

public class Task3 {    
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        double s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координаты x, y первой точки (через пробел): ");        
        x1 = sc.nextDouble();        
        y1 = sc.nextDouble();
        System.out.print("Введите координаты x, y второй точки (через пробел): ");        
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.print("Введите координаты x, y третьей точки (через пробел): ");        
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();        
        // определяем площадь треугольника, образуемого точками,
        // если она равна нулю, то все три точки лежат на одной прямой
        s = ((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1)) / 2;
        if(s == 0) System.out.println("Эти три точки лежат на одной прямой.");
        else System.out.println("Эти три точки не лежат на одной прямой.");
    }
}
