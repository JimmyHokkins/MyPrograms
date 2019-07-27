public class Task5 {    
    public static void main(String[] args) {
        int array[] = new int[30];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30) + 1;
        }
        System.out.println("Сортировка вставками. Исходный массив: ");
        show(array);        
        int index, temp;
        for(int i = 1; i < array.length; i++) {
            index = binarySearch(array, array[i], 0, i);
            temp = array[i];
            for(int t = i; t > index; t--) {
                array[t] = array[t - 1];
            }
            array[index] = temp;            
        }
        System.out.println("Результирующий массив: ");
        show(array);
    } 
    static int binarySearch(int[] ar, int num, int begin, int end) {   // метод двоичного поиска
        if(end - begin <= 1) {
            if(num < ar[begin]) return begin;
            else return begin + 1;
        }        
        if(num > ar[begin + (end - begin)/2]) begin = begin + (end - begin)/2;                     
        else end = end - (end - begin)/2;        
        return binarySearch(ar, num, begin, end);    
    }
    static void show(int ar[]){
        for(int x : ar) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
