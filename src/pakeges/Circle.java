package pakeges;

public class Circle {
    int centerX = 1;
    int centerY = 1;
    int radius = 1;
    int width = 1;
    String color;

    public Circle (int cenretX, int centerY, int radius){
       this.centerX = cenretX;
       this.centerY = centerY;
       this.radius = radius;
    }
    public Circle (int cenretX, int centerY, int radius, int width){
        this.centerX = cenretX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle (int cenretX, int centerY, int radius, int width, String color){
        this.centerX = cenretX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
