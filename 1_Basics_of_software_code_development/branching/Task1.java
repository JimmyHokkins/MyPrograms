import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первый угол треугольника: ");
        x = sc.nextInt();
        System.out.print("Введите второй угол треугольника: ");
        y = sc.nextInt();
        if((x + y) >=180)
            System.out.println("Треугольник с такими углами не существует!");        
        else if((x + y) == 90)
            System.out.println("Треугольник с такими углами существует и он прямоугольный!");        
        else 
            System.out.println("Треугольник с такими углами существует!");        
    }
}
