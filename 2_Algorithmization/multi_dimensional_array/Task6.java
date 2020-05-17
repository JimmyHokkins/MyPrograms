/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
1   1   1  ...  1   1   1
0   1   1  ...  1   1   0
0   0   1  ...  1   0   0
.
.
.
0   1   1  ...  1   1   0
1   1   1  ...  1   1   1

*/

public class Task6 {    
    public static void main(String[] args) {
        int S = 6;
        int array[][] = new int[S][S];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < S; j++) {
                if(i <= (S/2 - 1)) {
                    if(j > (S - 1 - i) || j <= (i - 1)) 
                        array[i][j] = 0;
                    else array[i][j] = 1;
                }
                else {
                    if(j < (S - 1 - i) || j > i) 
                        array[i][j] = 0;
                    else array[i][j] = 1;
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
