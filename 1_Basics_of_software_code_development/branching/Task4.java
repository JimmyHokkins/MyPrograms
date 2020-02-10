/*
Заданы размеры А, В прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет
ли кирпич через отверстие
*/

import java.util.Scanner;

public class Task1 {    
    public static void main(String[] args) {
        double x, y, z, s1, s2, s3;  // параметры кирпича
        double A, B, s;  // параметры отверстия
        boolean traverse = false;
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры отверстия.");        
        System.out.print("Размер A: ");
        A = sc.nextDouble();
        System.out.print("Размер В: ");
        B = sc.nextDouble();
        System.out.println("Введите размеры кирпича.");
        System.out.print("Размер x: ");
        x = sc.nextDouble();
        System.out.print("Размер y: ");
        y = sc.nextDouble();
        System.out.print("Размер z: ");
        z = sc.nextDouble();        
        s = A * B;  // площадь отверстия
        s1 = x * y; // площадь 1-ой грани кирпича
        s2 = x * z; // площадь 2-ой грани кирпича
        s3 = y * z; // площадь 3-ей грани кирпича        
        if(s1 < s) {
            if((x < A && y < B) || (x < B && y < A)) traverse = true;
        }
        if(s2 < s) {
            if((x < A && z < B) || (x < B && z < A)) traverse = true;
        }
        if(s3 < s) {
            if((z < A && y < B) || (z < B && y < A)) traverse = true;
        }       
        answer = (traverse == true)? "Кирпич пройдет через отверстие." : "Кирпич не пройдет через отверстие.";
        System.out.println(answer);
    }
}
