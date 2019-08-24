/*
  Создать класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
  из пяти элементов). Создать массив из десяти элементов такого типа. Добавить возможность вывода фамилий 
  и номеров групп студентов, имеющих оценки только 9 или 10.
*/  

import java.util.Arrays;

public class Task3 {    
    public static void main(String[] args) {
        Student[] groupSt = {  
            new Student("John Doe", "IT-2019", new int[]{8, 7, 9, 10, 8}), 
            new Student("John Silver", "IT-2018", new int[]{7, 6, 9, 8, 10}),
            new Student("Billy Bons", "IT-2017", new int[]{8, 7, 8, 9, 7}),
            new Student("Doctor Livesey", "IT-2016", new int[]{10, 9, 9, 10, 9}), 
            new Student("Jimmy Hokkins", "IT-2019", new int[]{9, 10, 9, 10, 10}),
            new Student("Black Dog", "IT-2018", new int[]{6, 8, 7, 9, 10}),
            new Student("Squire Trelawney", "IT-2017", new int[]{8, 6, 9, 10, 7}), 
            new Student("Blind Pew", "IT-2016", new int[]{9, 10, 7, 9, 8}),
            new Student("Ben Gunn", "IT-2019", new int[]{7, 10, 8, 9, 10}),
            new Student("Captain Smollett", "IT-2018", new int[]{9, 10, 10, 9, 9})
        };
        
        for(int i = 0; i < groupSt.length; i++){
            boolean f = true;
            for(int j = 0; j < groupSt[i].getScores().length; j++) {
                if(groupSt[i].getScores()[j] < 9) {
                    f = false;
                    break;
                }                
            }
            if(f == true) System.out.println("Name: " + groupSt[i].getName() + ", group: " + groupSt[i].getGroup() + 
                    ", scores: " + Arrays.toString(groupSt[i].getScores()));
        }
    }
}

class Student {
    private String name;
    private String group;
    private int[] scores;
    public Student(){}
    public Student(String name, String group, int[] scores) {
        this.name = name;
        this.group = group;
        this.scores = scores;        
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int[] getScores() {
        return scores;
    }   
}
