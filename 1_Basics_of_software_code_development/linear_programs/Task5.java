import java.util.Scanner;

public class Task5 {    
    public static void main(String[] args) {
        System.out.print("Введите промежуток времени в секундах: ");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hours = time/3600;
        int minutes = (time - hours * 3600) / 60;
        int seconds = (time - hours * 3600) - minutes * 60;        
        System.out.printf("Это время в часах, минутах и секундах: %02dч %02dмин %02dс\n", hours, minutes, seconds);
    }
}
