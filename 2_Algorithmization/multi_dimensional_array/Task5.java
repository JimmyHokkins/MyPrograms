public class Task5 {    
    public static void main(String[] args) {
        int S = 6;
        int array[][] = new int[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                if(j > (S - 1 - i)) array[i][j] = 0;
                else array[i][j] = i + 1;
            }
        }
        System.out.println("Матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }       
    }
}
