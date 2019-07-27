import java.util.Scanner;

public class Task2 {    
    public static void main(String[] args) {
        int a, b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите границы отрезка [a, b].");
        System.out.print("Введите левую границу a: ");
        a = sc.nextInt();
        System.out.print("Введите правую границу b: ");
        b = sc.nextInt();
        System.out.print("Введите шаг h: ");
        h = sc.nextInt();
        if(a < b) {
            System.out.println("Значения функции на отрезке [" + a + ", " + b + "], шаг " + h + ": ");            
            for(int i = a; i <= b; i += h) {
                if(i > 2) System.out.print(i + " ");
                else System.out.print(-i + " ");
            }
            System.out.println();
        }
        else System.out.println("Некорректно заданы границы отрезка.");
    }
}
