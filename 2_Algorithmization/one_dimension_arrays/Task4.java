import static java.lang.Math.*;

public class Task4 {    
    public static void main(String[] args) {
        double array[] = new double[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = round((random() * 21 - 10) * 100) / 100.0;
        }        
        System.out.print("Исходный массив: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }
        double min, max, temp;
        int iMin = 0, iMax = 0;
        min = max = array[0];
        for(int i=0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                iMax = i;
            }
            if(array[i] < min) {
                min = array[i];
                iMin = i;
            }
        }        
        System.out.println("\nМаксимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);        
        temp = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = temp;        
        System.out.print("Максимум и минимум поменялись местами: ");
        for(double x : array) {
            System.out.print(x + "  ");
        }
        System.out.println();       
    }
}
