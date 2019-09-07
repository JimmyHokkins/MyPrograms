public class Task5 {    
    public static void main(String[] args) {
        System.out.println("Счетчик с параметрами по умолчанию: ");
        Counter counter1 = new Counter();
        for(int i = 0; i < 15; i++) {
            System.out.println(counter1.add());
        }
        System.out.println("Счетчик с произвольными параметрами: ");
        Counter counter2 = new Counter(-5, 45, 0, 2);
        System.out.println(counter2.getCurrentValue());
        for(int i = 0; i < 25; i++) {
            System.out.println(counter2.add());
        }        
    }
}

class Counter {    
    private final int minVal;
    private final int maxVal;
    private int currentVal;
    private final int step;
    
    public Counter() {
        currentVal = minVal = 0;
        maxVal = 10;
        step = 1;
    }
    public Counter(int minVal, int maxVal, int currentVal, int step) {
        if(minVal > maxVal) {
            this.minVal = 0;
            this.maxVal = 10;            
        }
        else {
            this.minVal = minVal;
            this.maxVal = maxVal;
        }
        if(currentVal > maxVal || currentVal < minVal) this.currentVal = minVal;
        else this.currentVal = currentVal;
        this.step = step;
    }    
    public int add() {
        currentVal += step;
        if(currentVal > maxVal) currentVal = minVal;
        if(currentVal < minVal) currentVal = maxVal;
        return currentVal;
    }    
    public int sub() {
        currentVal -= step;
        if(currentVal < minVal) currentVal = maxVal;
        if(currentVal > maxVal) currentVal = minVal;        
        return currentVal;
    }    
    public int getCurrentValue() {
        return currentVal;
    }    
}
