import java.util.Scanner;

public class Task16 {    
    public static void main(String[] args) {
        System.out.print("Укажите порядок магического квадрата (3 или 4): ");        
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N == 3 || N == 4) {        
            int M = N * (N * N + 1) / 2;    // получаем магическую константу
            int ar[][] = genMagicSum(N*N, M, N);     // формируем комбинации чисел, сумма которых равна магической константе
            int ar2[][][] = matrixGen(ar);   //  формируем матрицы из полученных массивов чисел 
            findMagicSquares(ar2, M);   //  ищем среди полученных матриц магические квадраты
            System.out.println("\nВсего найдено " + count1 + " магических квадратов.");
        }
        else System.out.println("Неподходящий порядок.");
    }
    static int count1 = 0;
    static int[][] genMagicSum(int N, int MagicSum, int m) {        
        int count = 0;
        int count2 = 0;
        int combs[][] = new int[count][m];  
        int temp[][];
        if(m == 3){            
            for(int i = N; i > (N+1)/2; i--){
                for(int j = MagicSum - i - 1, k = 1; (j > (MagicSum - i - 1)/2) && (k < j); j--, k++){
                    int a[] = {i, j, k};
                    if(j != i && k != i && !checkEntry(a, combs)) {
                        temp = new int[count][3];
                        copyArray2(temp, combs);
                        count++;
                        combs = new int[count][3];
                        copyArray2(combs, temp);
                        combs[count - 1][0] = i;
                        combs[count - 1][1] = j;
                        combs[count - 1][2] = k;
                    }
                }
            }
        }
        else {    
            for(int i = 0; i < N/2; i++){                
                int M = MagicSum - N + i;
                int temp1[][] = genMagicSum(N-1-i, M, m-1);                
                for(int t = 0; t < temp1.length; t++){
                    if(!checkEntry4(N-i,temp1[t])){
                        temp = new int[count][m];
                        copyArray2(temp, combs);
                        count++;
                        combs = new int[count][m];
                        copyArray2(combs, temp);                    
                        combs[count - 1][0] = N - i;                        
                        for(int j = 1, k = 0; j < combs[0].length; j++, k++){
                            combs[count - 1][j] = temp1[t][k];                                                                
                        }
                    }
                }              
            }
        }        
        return combs;
    }
    static void show(int a[][]){        
        for(int x[] : a){
            for(int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        } 
        System.out.println("\n");
    }
    static void copyArray(int a1[], int a2[]){
        for(int i = 0; i < a1.length; i++) 
            a1[i] = a2[i];       
    }    
    static void copyArray2(int a1[][], int a2[][]) {        
        for(int i = 0; i < a2.length; i++){
            for(int j = 0; j < a2[0].length; j++){
                a1[i][j] = a2[i][j];
            }
        }
    }
    static void copyArray3(int a1[][][], int a2[][][]) {
        for(int k = 0; k < a2.length; k++)
            for(int i = 0; i < a2[0].length; i++){
                for(int j = 0; j < a2[0][0].length; j++){
                    a1[k][i][j] = a2[k][i][j];
                }
            }
    }
    static void copyArray4(int a1[], int a2[], int n) {        
        for(int i = 0, j = 0; j < a2.length; j++){
            if(j != n) {
                a1[i] = a2[j];
                i++;
            }
        }        
    }
    static void copyArray5(int a1[][], int a2[][], int n) {        
        for(int i = 0, t = 0; i < a2.length; i++){
            if(i == n) continue;
            for(int j = 0; j < a1[0].length; j++){
                a1[t][j] = a2[i][j];                
            }
            t++;
        }     
    }
    static boolean checkEntry(int a1[], int a2[][]) {
        int f = 0;                
        for(int i = 0; i < a2.length; i++){
            for(int k = 0; k < a1.length; k++) {
                for(int j = 0; j < a1.length; j++) {
                    if(a1[k] == a2[i][j]) { 
                        f++;
                        break;
                    }
                }
            }
            if(f == a1.length) return true;
            else f = 0;
        }
        return false;
    }
    static boolean checkEntry2(int a1[], int a2[]){
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a1.length; j++) {
                if(a1[i] == a2[j]) return true;
            }
        }
        return false;
    }
    static boolean checkEntry3(int a1[], int a2[][]) {
        for(int k = 0; k < a1.length; k++) {
            for(int i = 0; i < a2.length; i++){
                for(int j = 0; j < a2[0].length; j++){
                    if(a1[k] == a2[i][j]) return true;
                }
            }
        }
        return false;
    }
    static boolean checkEntry4(int n, int a[]) {
        for(int i = 0; i < a.length; i++){
            if(n == a[i]) return true;
        }
        return false;
    }
    static boolean checkEntry5(int[] a1, int[] a2) {
        int f = 0;
        for(int i = 0; i < a1.length; i++) {
            if(a1[i] == a2[i]) f++;
        }
        if(f == a1.length) return true;
        return false;
    }
    static boolean checkEntry6(int[][] m, int[][][] ms){
        for(int i = 0; i < ms.length; i++) {
            int f = 0;
            for(int j = 0; j < m.length; j++) {
                if(checkEntry5(m[j], ms[i][j])) f++;
            }
            if(f == m.length) return true; 
        }
        return false;
    }
    static void matrixReset(int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++) {
                a[i][j]=0;
            }
        }
    }
    static int[][][] matrixGen(int array[][]){
        int N = array.length, M = array[0].length;
        int count = 0;
        int[][][] matrixes = new int[count][M][M];
        int temp[][][];
        int[][] matrix = new int[M][M];
        for(int i = 0; i < N; i++) {
            copyArray(matrix[0], array[i]);
            int f = 1;
            for(int t = 0; t < N; t++){
                if(!checkEntry3(array[t], matrix)){
                    copyArray(matrix[f], array[t]);
                    f++;
                    if(f == M) {
                        if(!checkEntry6(matrix, matrixes)){
                            count = matrixes.length;
                            temp = new int[count][M][M];
                            copyArray3(temp, matrixes);                        
                            count++;
                            matrixes = new int[count][M][M];
                            copyArray3(matrixes, temp);
                            copyArray2(matrixes[count - 1], matrix);
                            matrixes = addMatrix(matrix, matrixes, count, M);
                        }
                        f = 1;
                        matrixReset(matrix);
                        copyArray(matrix[0], array[i]);
                    }                    
                }
            }           
        }
        return matrixes;
    }
    static int[][][] addMatrix(int[][] matrix, int[][][] matrixes, int count, int M) {
        int[][] temp1 = new int[matrix.length][matrix[0].length];
        int[][][] temp2;
        if(M == 3) {            
            for(int i = 0; i < matrix.length; i++) {
                copyArray(temp1[0], matrix[i]);            
                for(int j = 0, t = 1; j < matrix.length; j++) {
                    if(j != i) copyArray(temp1[t++], matrix[j]);                         
                }
                for(int k = 0; k < 2; k++) {
                    if(!checkEntry6(temp1, matrixes)) {
                        temp2 = new int[count][M][matrix[0].length];
                        copyArray3(temp2, matrixes);
                        count++;
                        matrixes = new int[count][M][matrix[0].length];
                        copyArray3(matrixes, temp2);
                        copyArray2(matrixes[count - 1], temp1);
                    }
                    temp1 = swapString(temp1, 1, 2);
                }
            }
            return matrixes;
        }
        else {            
            for(int i = 0; i < matrix.length; i++){
                copyArray(temp1[0], matrix[i]);
                for(int j = 0, t = 1; j < matrix.length; j++) {
                    if(j != i) copyArray(temp1[t++], matrix[j]);                         
                }
                int[][] temp3 = new int[M - 1][matrix[0].length];
                copyArray5(temp3, temp1, 0);
                temp2 = new int[0][M - 1][M];
                temp2 = addMatrix(temp3, temp2, 0, M - 1);
                int[][][] temp4;
                for(int q = 0; q < temp2.length; q++) {                    
                    for(int v = 1, s = 0; v < temp1.length; v++, s++) {
                        copyArray(temp1[v], temp2[q][s]);
                    }
                    if(!checkEntry6(temp1, matrixes)) {
                        temp4 = new int[count][M][matrix[0].length];
                        copyArray3(temp4, matrixes);
                        count++;
                        matrixes = new int[count][M][matrix[0].length];
                        copyArray3(matrixes, temp4);
                        copyArray2(matrixes[count - 1], temp1);
                    }
                    
                }                
            }
        }
        return matrixes;
    }
    static int[][] swapString(int[][] matrix, int n, int m){
        int[][] temp = new int[matrix.length][matrix[0].length]; 
        int[] t;
        copyArray2(temp, matrix);
        t = temp[n];
        temp[n] = temp[m];
        temp[m] = t;
        return temp;
    }
    static void findMagicSquares(int matrixes[][][], int M){
        for(int i = 0; i < matrixes.length; i++){
            findMSWorker(matrixes[0].length - 1, matrixes[i], matrixes[0].length, M);
        }        
    }
    static void findMSWorker(int n, int array[][], int size, int M) {       
        if(n == 0) {            
            int matrix[][] = genCombs(array[0].length, array[n]);            
            int candidate[][] = new int[size][size];
            copyArray2(candidate, array);
            for(int i = 0; i < matrix.length; i++) {
                copyArray(candidate[n], matrix[i]);        
                if(checkMagicSquare(candidate, M)){
                    show(candidate);                    
                    count1++;
                }
            }
        }
        else {            
            int matrix[][] = genCombs(array[0].length, array[n]);
            int candidate[][] = new int[size][size];
            copyArray2(candidate, array);
            for(int i = 0; i < matrix.length; i++) {
                copyArray(candidate[n], matrix[i]);          
                findMSWorker(n - 1, candidate, size, M);
                if(checkMagicSquare(candidate, M)){                    
                    show(candidate);
                    count1++;
                }
            }
        }
    }
    static int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) f *= i;
        return f;
    }
    static int[][] genCombs(int n, int a[]){
        if(n == 3){
            int combs[][] = new int[6][n];
            int temp;
            for(int count = 0, i = 0; count < 6; count++) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                copyArray(combs[count], a);
                if(i == a.length - 2) i = 0;
                else i++;
            }
            return combs;
        }
        else if(n > 3){
            int a2[] = new int[a.length - 1];            
            int array[][];
            int cap = fact(n);
            int array2[][] = new int[cap][n];
            int count = 0;
            for(int i = 0; i < n; i++) {                
                copyArray4(a2, a, i);
                array = genCombs(n - 1, a2);                                
                for(int t = 0; t < array.length; t++) {
                    array2[count][0] = a[i];
                    for(int j = 1, k = 0; j < array2[0].length; j++, k++){                    
                        array2[count][j] = array[t][k];                        
                    }
                    count++;
                }
            }
            return array2;
        }
        return new int[0][0];
    }    
    static boolean checkMagicSquare(int matrix[][], int M){        
        int sum1 = 0, sum2 = 0;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum1 += matrix[i][j];
                sum2 += matrix[j][i];
            }
            if(sum1 != M || sum2 != M) return false;
            else sum1 = sum2 = 0;
        }       
        for(int i = 0; i < n; i++){
            sum1 += matrix[i][i];
            sum2 += matrix[i][n - i - 1];
        }
        if(sum1 != M || sum2 != M) return false;
        return true;
    }
}
