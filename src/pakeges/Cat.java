package pakeges;

import static java.lang.Math.round;

public class Cat {

    private String name;
    private int age = 1;
    private int weight = 1;
    private int strength;
    private String colour;
    private String adress;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setColour (String Colour){
        this.colour = colour;
    }
    public String getColour (){
        return this.colour;
    }
    public boolean fight(Cat AnotherCat)
    {
        if (this.strength > AnotherCat.getStrength())
            return true;
        else
        {
            if (this.strength == AnotherCat.getStrength()) {
                if (this.weight < AnotherCat.weight) {
                    return true;
                }
                else {
                    if (this.weight == AnotherCat.getWeight())
                    {
                        return (0 == round(Math.random()));
                    }
                    else return false;
                }
            }
            else
            {
                return false;
            }
        }
    }

    public void initialize(){

    }

    public Cat(String name){
        this.name = name;
    }

    public Cat(){

    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public Cat(String name, String colour, String adress){
        this.name = name;
        this.colour = colour;
        this.adress = adress;
    }
}
