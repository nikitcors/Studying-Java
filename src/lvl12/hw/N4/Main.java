package lvl12.hw.N4;


public class Main {
    public static void main(String[] args)  {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String  getObjectType(Object o){

        String s = "Хз";
        if (o instanceof  Cat){
            s ="Кот";
            return s;
        }
        if (o instanceof  Tiger){
            s ="Тигр" ;
            return s;
        }
        if (o instanceof  Lion){
            s ="Лев";
            return s;
        }
        if (o instanceof  Bull){
            s ="Бык";
            return s;
        }

        return s;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
