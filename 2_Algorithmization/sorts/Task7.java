public class Task7 {    
    public static void main(String[] args) {        
        int array[] = {1, 2, 4, 8, 16, 32, 64, 128};
        int array2[] = {3, 7, 11, 19, 33, 52, 94, 105};
        System.out.println("Исходные массивы: ");
        show(array);
        System.out.println();
        show(array2);        
        int array3[];        
        if(array[0] <= array2[0]) 
            array3 = genArray(array, array2);        
        else 
            array3 = genArray(array2, array);        
        System.out.println("\nРезультирующий массив: ");
        show(array3);             
    }
    static int[] genArray(int[] a1, int[] a2){
        int a3[] = new int[a1.length + a2.length];
        a3[0] = a1[0];
        int i = 1, j = 0, k = 0;
        System.out.println("\nЭлементы второй последовательности надо вставить \nна следующие места в первой последовательности: ");
        while(j < a3.length - 1) {
            while(i < a1.length && k < a2.length && a1[i] <= a2[k]) {
                a3[j + 1] = a1[i];                
                i++;
                j++;
            }
            while(k < a2.length && i < a1.length && a2[k] <= a1[i]) {
                a3[j + 1] = a2[k];
                System.out.print(i + " ");
                k++;
                j++;
            }
            if(i == a1.length){
                a3[j + 1] = a2[k];
                System.out.print(i + " ");
                k++;
                j++;
            }
            else if(k == a2.length) {
                a3[j + 1] = a1[i];                
                i++;
                j++;
            }            
        }
        return a3;
    }    
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
    }
}
