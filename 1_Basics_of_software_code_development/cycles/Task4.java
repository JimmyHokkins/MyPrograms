/*
Найти произведение квадратов первых двухсот чисел
*/

import java.math.BigInteger;

public class Task4 {    
    public static void main(String[] args) {
        // т.к. результирующее число очень большое, используем класс BigInteger
        BigInteger mul = BigInteger.valueOf(1);  // начальное значение произведения
        BigInteger i = BigInteger.valueOf(1);  // начальное число
        BigInteger limit = BigInteger.valueOf(200);  // конечное число
        while(i.compareTo(limit) == -1 || i.compareTo(limit) == 0) {  // пока число i меньше или равно конечного числа
            mul = mul.multiply(i.multiply(i));   // результирующее произведение квадратов         
            i = i.add(BigInteger.valueOf(1));  // получаем следующее число
        }
        System.out.println("Произведение квадратов первых 200 чисел равна " + mul);
    }
}
