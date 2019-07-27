import static java.lang.Math.*;

public class Task7 {    
    public static void main(String[] args) {
        int N = 5;
        double array[] = new double[2*N];
        for(int i = 0; i < array.length; i++) {
            array[i] = round((random() * 200 - 100) * 100) / 100.0;
        }        
        System.out.print("Исходный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }
        double max_sum = array[0] + array[2*N - 1];
        int i1 = 0, i2 = 2*N - 1;
        for(int i = 1, j = (2*N - 2); i < j; i++, j--) {
            if((array[i] + array[j]) > max_sum) {
                max_sum = array[i] + array[j];
                i1 = i;
                i2 = j;
            }
        }
        System.out.println("\nМаксимальной является сумма " + (i1+1) + "-го и " + (i2+1) + "-го элементов. Она равна " + max_sum);       
    }
}
