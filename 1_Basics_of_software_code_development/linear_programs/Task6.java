import java.util.Scanner;

public class Task6 {    
    public static void main(String[] args) {
        int x, y;
        String result = "нет, не принадлежит";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координаты х и y точки (через пробел): ");
        x = sc.nextInt();        
        y = sc.nextInt();
        if((y > 0 && y <= 4) && (x <= 2 && x >= -2)) result = "да, принадлежит";
        if((y <= 0 && y >= -3) && (x <= 4 && x >= -4)) result = "да, принадлежит";        
        System.out.println("Принадлежит ли точка закрашенной области: " + result);        
    }
}
