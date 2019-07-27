import java.util.Scanner;

public class Task11 {    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");        
        int numOne = sc.nextInt();
        System.out.print("Введите второе число: ");        
        int numTwo = sc.nextInt();
        inWhatNumberMore(numOne, numTwo);        
    }
    static void inWhatNumberMore(int numOne, int numTwo) {
        if(countOfDigits(numOne) > countOfDigits(numTwo)) 
            System.out.println("В первом числе больше цифр.");
        else if(countOfDigits(numOne) < countOfDigits(numTwo)) 
            System.out.println("Во втором числе больше цифр.");
        else 
            System.out.println("В числах одинаковое количество цифр.");
    }
    static int countOfDigits(int num){  // метод для подсчета цифр в числе
        if(num == 0) return 1;
        int count = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
