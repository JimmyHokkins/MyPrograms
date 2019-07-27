public class Task4 {    
    public static void main(String[] args) {
        int S = 6;
        int array[][] = new int[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                if(i % 2 == 0) {
                    array[i][j] = j + 1;
                }
                else {
                    array[i][j] = S - j;
                }
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
