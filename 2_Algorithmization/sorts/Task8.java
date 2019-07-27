public class Task8 {    
    public static void main(String[] args) {        
        int array[][] = new int[10][10];
        for(int i = 0; i < array[0].length; i++){
            array[0][i] = (int)(Math.random() * 4) + 1;    // числители дробей
            array[1][i] = (int)(Math.random() * 9) + 1;    // знаменатели дробей
        }
        System.out.println("Исходный массив дробей: ");
        show(array);
        int greater, temp;
        greater = array[1][0];        
        for(int i = 1; i < array[0].length; i++) {  // находим наибольший знаменатель
            if(array[1][i] > greater) greater = array[1][i];
        }
        int f = 0; 
        temp = greater;
        while(f <= array[0].length) {                 // находим общий знаменатель
            for(int i = 0; i < array[0].length; i++) {
                if(greater % array[1][i] != 0) {
                    greater += temp;
                    f = 0;
                    break;
                }
                else f++;
            }             
        }        
        for(int i = 0; i < array[0].length; i++) {  // домножаем числитель и знаменатель на коэффициенты
            array[0][i] *= greater/array[1][i];
            array[1][i] *= greater/array[1][i];
        }
        System.out.println("Массив дробей, приведенных к общему знаменателю: ");
        show(array);        
        for(int i = 0; i < array[0].length; i++){     //  сортируем дроби
            for(int j = 0; j < array[0].length - i - 1; j++) {
                if(array[0][j] > array[0][j + 1]) {
                    temp = array[0][j];
                    array[0][j] = array[0][j + 1];
                    array[0][j + 1] = temp;
                    temp = array[1][j];
                    array[1][j] = array[1][j + 1];
                    array[1][j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив дробей, приведенных к общему знаменателю: ");
        show(array);                 
    }    
    static void show(int ar[][]){
        for(int i = 0; i < ar[0].length; i++){
            System.out.print(ar[0][i] + "/" + ar[1][i] + "  ");
        }
        System.out.println();
    }
}
