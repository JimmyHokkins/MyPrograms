import java.util.Scanner;

public class Task12 {    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число K: ");
        int K = sc.nextInt();
        System.out.print("Введите число N: ");
        int N = sc.nextInt();
        int[] result = getArray(N, K);
        System.out.println("Числа, сумма которых равна К, и которые меньше N: ");
        for(int x : result) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }
    static int sumOfDigits(int num) {  // метод, определяющий сумму цифр в числе
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    static int[] getArray(int N, int K) {
        int count = 0;
        for(int i = N - 1; i >= 0; i--) {
            if(sumOfDigits(i) == K) count++;
        }
        int[] array = new int[count];
        count = 0;
        for(int i = 0; i < N; i++) {
            if(sumOfDigits(i) == K) array[count++] = i;
        }
        return array;
    }
}
