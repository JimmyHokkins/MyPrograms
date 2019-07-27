public class Task6 {    
    public static void main(String[] args) {
        int array[] = new int[30];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30 - 15) + 1;
        }
        System.out.println("Сортировка Шелла. Исходный массив: ");
        show(array);     
        int d = array.length/2;
        int temp;
        while(d >= 1){
            for(int i = d; i < array.length; i++) {                
                for(int j = i; (j >= 0) && ((j - d) >= 0); j -= d) {
                    if(array[j] < array[j - d]) {
                        temp = array[j];
                        array[j] = array[j - d];
                        array[j - d] = temp;
                    }                    
                }       
            }
            d /= 2;
        }        
        System.out.println("Результирующий массив: ");
        show(array);
    }     
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
