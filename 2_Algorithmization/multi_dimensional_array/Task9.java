public class Task9 {    
    public static void main(String[] args) {
        int S1 = 6, S2 = 10;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        int sum = 0, sum_max = 0, index = 0;
        for(int j = 0; j < S2; j++) {
            for(int i = 0; i < S1; i++) {  // находим сумму элементов очередного столбца
                sum += array[i][j];
            }
            if(sum > sum_max) {  
                sum_max = sum;
                index = j + 1;
            }
            sum = 0;
        }
        System.out.println("Максимальная сумма элементов равна " + sum_max + " в " + index + "-м столбце.");       
    }
}
