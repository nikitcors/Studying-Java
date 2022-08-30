package pakeges;

public class Friend {

    String name;
    int age;
    boolean gender;
    public static final boolean male = false;
    public static final boolean famale = true;

    public Friend (String name){
        this.name = name;
    }

    public Friend (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend (String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
