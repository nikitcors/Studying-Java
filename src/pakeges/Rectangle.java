package pakeges;

public class Rectangle {
    public int top = 0;
    public int left = 0;
    public int width = 0;
    public int height = 0;

    public Rectangle (int top){
        this.top = top;
    }

    public Rectangle (int top,int left){
        this.top = top;
        this.left = left;
    }

    public Rectangle (int top,int left, int height){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = height;
    }

    public Rectangle (int top,int left, int width,int height){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle (Rectangle Rectangle){
        this.top = Rectangle.top;
        this.left = Rectangle.left;
        this.height = Rectangle.height;
        this.width = Rectangle.width;
    }
}
