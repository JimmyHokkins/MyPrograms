/* 
  Создать класс Test1 с двумя переменными. Добавить метод вывода на экран и методы для изменения этих
  переменных. Добавить метод, который находит сумму значений этих переменных, и метод, который находит
  наибольшее значение из этих двух переменных.
*/

public class Task1 {    
    public static void main(String[] args) {
        Test1 myClass = new Test1();
        myClass.setX(5);
        myClass.setY(10);
        myClass.showXY();
        myClass.maxXorY();        
    }
}

class Test1 {
    private int x;
    private int y;
    public void showXY() {
        System.out.println("x = " + x + ", " + "y = " + y);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int sumXY(){
        return x + y;
    }
    public void maxXorY(){
        if(x > y) System.out.println("Максимум это х.");
        else if(x < y) System.out.println("Максимум это y.");
        else System.out.println("Переменные х и y равны.");
    }   
}
