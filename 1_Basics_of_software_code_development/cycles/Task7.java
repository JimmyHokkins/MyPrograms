import java.util.Scanner;

public class Task7 {    
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите границы промежутка m и n (m < n).");
        System.out.print("Введите левую границу m: ");
        m = sc.nextInt();
        System.out.print("Введите правую границу n: ");
        n = sc.nextInt();        
        if(m < n) {
            System.out.println("Делители чисел, содержащихся в данном промежутке:");
            for(int i = m; i <= n; i++) {
                System.out.print("Число " + i + ":  ");
                for(int j = 2; j <= Math.abs(i)/2; j++) {
                    if(i % j == 0) System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Некорректно заданы границы промежутка.");
    }
}
