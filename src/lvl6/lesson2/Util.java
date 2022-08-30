package lvl6.lesson2;


public class Util {
    public static double getDistants(int x1,int y1,int x2,int y2){
       return Math.pow((Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2)),0.5);
    }
}
