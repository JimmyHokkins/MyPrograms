/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и
номера строк, в которых число 5 встречается три и более раз.
*/

public class Task11 {    
    public static void main(String[] args) {
        int S1 = 10, S2 = 20;
        int array[][] = new int[S1][S2];
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                array[i][j] = (int)(Math.random() * 16);
            }
        }        
        System.out.println("Исходная матрица: ");
        for(int x[] : array) {
            for(int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
        int count = 0, rows = 0;
        System.out.print("Строки, содержащие число 5 три и более раз: ");
        for(int i = 0; i < S1; i++) {
            for(int j = 0; j < S2; j++) {
                if(array[i][j] == 5) count++;                
            }
            if(count >= 3) {
                System.out.print((i + 1) + "  ");
                rows++;
            }
            count = 0;
        }
        if(rows == 0) System.out.print("таких строк нет");
        System.out.println();
    }
}
