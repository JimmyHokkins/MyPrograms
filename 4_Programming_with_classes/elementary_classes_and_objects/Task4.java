/*
  Создать класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
  Создать массив из 5 элементов типа Train, добавить возможность сортировки элементов массива по номерам поездов.
  Добавить возможность вывода информации о поезде, номер которого введен пользователем. Добавить возможность
  сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены 
  по времени отправления.
*/
  
public class Task4 {    
    public static void main(String[] args) {
        Calendar date = new GregorianCalendar();
        Train[] trains = {            
            new Train("New York", 1121, new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 
                    date.get(Calendar.DAY_OF_MONTH), 14, 11)),
            new Train("Chicago", 1008, new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 
                    date.get(Calendar.DAY_OF_MONTH), 10, 30)),
            new Train("Boston", 3556, new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 
                    date.get(Calendar.DAY_OF_MONTH), 8, 57)),
            new Train("Los Angeles", 2449, new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 
                    date.get(Calendar.DAY_OF_MONTH), 22, 45)),
            new Train("Los Angeles", 8813, new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 
                    date.get(Calendar.DAY_OF_MONTH), 15, 28))            
        };
        System.out.println("Исходный массив поездов:");
        System.out.println(Arrays.toString(trains));
        CompareTrainNumber ctn = new CompareTrainNumber();
        Arrays.sort(trains, ctn);
        System.out.println("Массив поездов, отсортированный по номерам поездов:");
        System.out.println(Arrays.toString(trains));
        
        System.out.print("\nВведите номер поезда: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean f = false;
        for(Train item : trains) {
            if(item.getNumber() == num) {
                System.out.println("Искомый поезд: " + item.toString());
                f = true;
            }
        }
        if(!f){
            System.out.println("Поезда с таким номером нет");
        }
        
        CompareTrainDestination ctd = new CompareTrainDestination();
        Arrays.sort(trains, ctd);
        System.out.println("Массив поездов, отсортированный по пунктам назначения:");
        System.out.println(Arrays.toString(trains));        
    }
}
class Train {
    private String destination;
    private int number;
    private Calendar date;
    public Train(String d, int n, Calendar dt) {
        destination = d;
        number = n;
        date = dt;
    }
    String getDestination(){
        return destination; 
    }
    int getNumber(){
        return number;
    }
    Calendar getDate(){
        return date;
    }
    @Override
    public String toString(){
        String str = "Train №" + number + ", to " + destination + ", date: " + date.getTime() + '\n';        
        return str;
    }
}
class CompareTrainNumber implements Comparator<Train> {
    @Override
    public int compare(Train t1, Train t2) {
        return (t1.getNumber() - t2.getNumber());        
    }
}
class CompareTrainDestination implements Comparator<Train> {
    @Override
    public int compare(Train t1, Train t2) {
        if(t1.getDestination().compareTo(t2.getDestination()) == 0) {
            return (int)(t1.getDate().getTimeInMillis()/60000 - t2.getDate().getTimeInMillis()/60000);
        }
        return t1.getDestination().compareTo(t2.getDestination());        
    }
}
