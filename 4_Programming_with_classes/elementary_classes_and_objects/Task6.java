public class Task6 {    
    public static void main(String[] args) {
        Time myTime = new Time(19, 10, 35);
        myTime.printTime();  
        myTime.addHours(2);  // прибавляем 2 часа к исходному времени
        myTime.printTime();  
        myTime.addHours(5);  // прибавляем еще 5 часов
        myTime.printTime();
        myTime.addHours(50); // прибавляем еще 50 часов
        myTime.printTime();
        myTime.addHours(20); // прибавляем еще 20 часов
        myTime.printTime();
        myTime.addMinutes(25);  // прибавляем 25 минут
        myTime.printTime();
        myTime.addMinutes(40);  // прибавляем еще 40 минут
        myTime.printTime();
        myTime.addMinutes(120); // прибавляем еще 120 минут
        myTime.printTime();
        myTime.addHours(19);  // прибавляем еще 19 часов
        myTime.printTime();
        myTime.addMinutes(180);  // прибавляем еще 180 минут
        myTime.printTime();
        myTime.addSeconds(20); // прибавляем 20 секунд
        myTime.printTime();
        myTime.addSeconds(25);  // прибавляем еще 25 секунд
        myTime.printTime();
        myTime.addHours(22);  // прибавляем еще 22 часа
        myTime.printTime();
        myTime.addSeconds(3600);   // прибавляем еще 3600 секунд
        myTime.printTime();
        myTime.addHours(-2);   // отнимаем 2 часа
        myTime.printTime();
        myTime.addHours(-5);  // отнимаем еще 5 часов
        myTime.printTime();
        myTime.addMinutes(-20);  // отнимаем 20 минут
        myTime.printTime();
        myTime.addHours(8);    // прибавляем 8 часов
        myTime.printTime();
        myTime.addMinutes(-60);  // отнимаем 60 минут
        myTime.printTime();
        myTime.addSeconds(-35);  // отнимаем 35 секунд
        myTime.printTime();
        myTime.addMinutes(10);  // добавляем 10 минут
        myTime.printTime();
        myTime.addSeconds(-420);  // отнимаем 420 секунд 
        myTime.printTime();
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;    
    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public final void setHours(int hours) {
        if(hours >= 0 && hours < 24) this.hours = hours;
        else this.hours = 0;
    }
    public final void setMinutes(int minutes) {
        if(minutes >= 0 && minutes < 60) this.minutes = minutes;
        else this.minutes = 0;
    }
    public final void setSeconds(int seconds) {
        if(seconds >= 0 && seconds < 60) this.seconds = seconds;
        else this.seconds = 0;  
    }
    public final int getHours() {
        return hours;
    }
    public final int getMinutes() {
        return minutes;
    }
    public final int getSeconds() {
        return seconds;
    }
    public void addHours(int hours) {
        int temp = this.hours + hours;
        if(temp > 23) {            
            while(temp > 23) {
                temp -= 24;                
            }
            this.hours = temp;
        }
        else if(temp < 0) {
            while(temp < 0) {
                temp += 24;
            }
            this.hours = temp;
        }
        else this.hours += hours;
    }
    public void addMinutes(int minutes) {
        int temp = this.minutes + minutes;
        if(temp > 59) {            
            while(temp > 59) {
                addHours(1);
                temp -= 60;                
            }
            this.minutes = temp;           
        }
        else if(temp < 0) {
            while(temp < 0) {
                addHours(-1);
                temp += 60;
            }
            this.minutes = temp;
        }
        else this.minutes += minutes;
    }
    public void addSeconds(int seconds) {
        int temp = this.seconds + seconds;
        if(temp > 59) {            
            while(temp > 59) {
                addMinutes(1);
                temp -= 60;                
            }
            this.seconds = temp;           
        }
        else if(temp < 0) {
            while(temp < 0) {
                addMinutes(-1);
                temp += 60;
            }
            this.seconds = temp;
        }
        else this.seconds += seconds;
    } 
    public void printTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
