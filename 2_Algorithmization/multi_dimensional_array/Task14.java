public class Task14 {    
    public static void main(String[] args) {
        int S1 = 10, S2 = 6;
        int array[][] = new int[S1][S2];
        int sum = 0;
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {                
                int k;
                for(k = 0; k < i; k++) {
                    sum += array[k][j];
                }
                if(sum == j + 1) array[i][j] = 0;
                else if((S1 - i + sum) <= j + 1) array[i][j] = 1;
                else array[i][j] = (int)(Math.random() * 2);
                sum = 0;
            }            
        }        
        System.out.println("Полученная матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }     
}
