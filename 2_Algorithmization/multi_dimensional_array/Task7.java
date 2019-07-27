import static java.lang.Math.*;

public class Task7 {    
    public static void main(String[] args) {
        int S = 6;
        double array[][] = new double[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                array[i][j] = round(sin((i*i - j*j) / S) * 100) / 100.0;
            }
        }        
        int count = 0;
        System.out.println("Матрица: ");
        for(double x[] : array) {
            for(double y : x) {
                System.out.print(y + "\t");
                if(y > 0) count++;
            }
            System.out.println();
        }
        System.out.println("Число положительных элементов в ней: " + count);
    }
}
