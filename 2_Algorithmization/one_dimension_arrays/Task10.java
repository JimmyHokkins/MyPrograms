public class Task10 {    
    public static void main(String[] args) {
        int SIZE = 20;
        int array[] = new int[SIZE];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1;
        }        
        System.out.print("Исходный массив: ");
        showArray(array);       
        for(int i = 0; i < array.length; i++) {            
            if(i % 2 != 0) array[i] = 0;            
        }
        System.out.print("\nПромежуточный массив: ");
        showArray(array);
        for(int i = 1; i < SIZE/2; i++) {
            for(int j = i; j < SIZE - 1; j++) {
                array[j] = array[j + 1];
            }
        }
        System.out.print("\nРезультирующий массив: ");
        showArray(array);
        System.out.println();       
    }
    static void showArray(int[] array) {
        for(int x : array) {
            System.out.print(x + "  ");
        }
    }
}
