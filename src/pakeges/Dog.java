package pakeges;

public class Dog {
    String name;
    int age;
    String colour;
    int height = 1;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public Dog (String name){
        this.name = name;
    }

    public Dog (String name, int height){
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, String colour){
        this.name = name;
        this.height = height;
        this.colour = colour;
    }
}
