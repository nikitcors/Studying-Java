package lvl12.hw.N5;


public class Main {
    public static void main(String[] args)  {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        String s = "Животное";
        if (o instanceof Cat){
            s ="Кот";
            return s;
        }
        if (o instanceof Tiger){
            s ="Тигр" ;
            return s;
        }
        if (o instanceof Lion){
            s ="Лев";
            return s;
        }
        if (o instanceof Bull){
            s ="Бык";
            return s;
        }
        if (o instanceof Cow){
            s ="Корова";
            return s;
        }

        return s;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }

}
