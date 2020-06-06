/*
На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие
между какими из пар точек самое большое расстояние. Координаты точек занести в массив.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task4 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число точек на плоскости: ");
        int N = sc.nextInt();
        int[][] points = new int[N][2];
        for(int i = 0; i < points.length; i++){
            System.out.print("Введите координаты " + (i + 1) + "-й точки (через пробел): ");
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println("Самое большое расстояние между следующими точками: ");
        greatestDistance(points);        
    }
    static void greatestDistance(int[][] pnts) {        
        double maxDist = 0;
        double dist;
        int first = 0, second = 0;
        for(int i = 0; i < pnts.length - 1; i++) {   // перебираем все точки и ищем наибольшее расстояние между ними
            for(int j = i + 1; j < pnts.length; j++) {
                dist = calcDistance(pnts[i][0], pnts[i][1], pnts[j][0], pnts[j][1]);                
                if(dist > maxDist) {
                    maxDist = dist;
                    first = i;
                    second = j;
                }
            }
        }
        System.out.print("точка с координатами (" + pnts[first][0] + ", " +  pnts[first][1] + ") и ");
        System.out.println("точка с координатами (" + pnts[second][0] + ", " +  pnts[second][1] + ")");
    }
    static double calcDistance(int x1, int y1, int x2, int y2) {  // метод для вычисления расстояния между двумя точками
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));        
    }
}
