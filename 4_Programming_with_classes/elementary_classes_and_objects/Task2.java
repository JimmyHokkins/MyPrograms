/*
  Создать класс Test2 с двумя переменными. Добавить конструктор с входными параметрами. Добавить
  конструктор, инициализирующий члены класса по умолчанию. Добавить set- и get-методы для полей
  экземпляра класса.
*/

public class Task2 {    
    public static void main(String[] args) {
        Test2 testOne = new Test2();
        testOne.setX(3);
        testOne.setY(8);
        System.out.println("Класс testOne: x = " + testOne.getX() + ", y = " + testOne.getY());
        
        Test2 testTwo = new Test2(4, 12);
        System.out.println("Класс testTwo: x = " + testTwo.getX() + ", y = " + testTwo.getY());
    }
}

class Test2 {
    private int x;
    private int y;
    public Test2() {
        x = 5; 
        y = 10;
    }
    public Test2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }    
}
