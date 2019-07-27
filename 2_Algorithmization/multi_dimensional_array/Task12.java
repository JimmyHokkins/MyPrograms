public class Task12 {    
    public static void main(String[] args) {
        int S1 = 6, S2 = 10;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        showMatrix(array);
        int temp;
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                for(int k = 0; k < (S2 - j - 1); k++) {
                    if(array[i][k] > array[i][k+1]) {
                        temp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица с отсортированными по возрастанию строками: ");
        showMatrix(array);
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                for(int k = 0; k < (S2 - j - 1); k++) {
                    if(array[i][k] < array[i][k+1]) {
                        temp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temp;
                    }
                }
            }
        }
        System.out.println("Матрица с отсортированными по убыванию строками: ");
        showMatrix(array);        
    }    
    // метод для вывода 
    static void showMatrix(int a[][]) {
        for(int x[] : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
