public class Task10 {    
    public static void main(String[] args) {
        int S = 5;
        int array[][] = new int[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                array[i][j] = (int)(Math.random() * 20 - 10);
            }
        }        
        System.out.println("Исходная матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Положительные элементы главной диагонали: ");
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                if(i == j && array[i][j] > 0) System.out.print(array[i][j] + " ");
            }
        } 
        System.out.println();
    }
}
