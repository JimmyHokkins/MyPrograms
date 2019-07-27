import java.util.Scanner;

public class Task4 {    
    public static void main(String[] args) {
        System.out.print("Укажите число в виде nnn.ddd: ");
        double num, x, y, z;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        x = (int)num;  // получаем целую часть
        y = num - x;   // получаем дробную часть
        z = y * 1000 + x / 1000;  // формируем новое число, поменяв целую и дробную части местами
        z = Math.round(z * 1000) / 1000.0; // округляем, чтобы получить нужный вид числа
        System.out.println("Целая и дробная части поменялись местами: " + z);
    }
}
