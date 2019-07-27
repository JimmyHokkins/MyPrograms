public class Task9 {    
    public static void main(String[] args) {
        int SIZE = 20;
        int array[] = new int[SIZE];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1;
        }        
        System.out.print("Исходный массив: ");
        for(int x : array) {
            System.out.print(x + "  ");
        }        
        int arrayVal[] = new int[SIZE];  // массив для хранения встречающихся значений
        int arrayCount[] = new int[SIZE];  // массив для хранения числа вхождений встречающихся значений 
        int countValues = 0, flag = 0;        
        for(int i = 0; i < array.length; i++) {      // перебираем исходный массив      
            for(int j = 0; j < countValues; j++) {   // смотрим в массиве встречающихся значений
                if(array[i] == arrayVal[j]) {  // если такое значение уже было, отмечаем это
                    flag++;
                    break;
                }
            }
            if(flag == 0) {  // если значение не было обнаружено в массиве встречающихся значений, то добавляем его туда
                int count = 0;
                for(int k = i; k < array.length; k++) {
                    if(array[k] == array[i]) count++; // подсчитываем, сколько раз значение встречается в исходном массиве
                }
                arrayVal[countValues] = array[i]; // вносим значение в массив встречающихся значений
                arrayCount[countValues] = count;  // вносим число вхождений данного значения
                countValues++; 
            }
            flag = 0;
        }        
        System.out.println("\nЗначения, встречающиеся в массиве: ");
        for(int i = 0; i < countValues; i++) {
            System.out.println(arrayVal[i] + " встречается " + arrayCount[i] + " раз(а)");
        }        
        int max = arrayCount[0], min = arrayVal[0]; 
        for(int i = 0; i < countValues; i++) {  // находим наиболее часто встречающееся число
            if(arrayCount[i] > max){
                max = arrayCount[i];
                min = arrayVal[i];
            }
        }        
        for(int i = 0; i < countValues; i++) {  // находим минимальное из наиболее часто встречающихся чисел
            if(arrayCount[i] == max && arrayVal[i] < min) min = arrayVal[i]; 
        }        
        System.out.println("Наименьшее из наиболее часто встречающихся чисел - это " + min);        
    }
}
