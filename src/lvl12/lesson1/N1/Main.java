package lvl12.lesson1.N1;




public class Main {
    public static void main(String[] args)
    {
        Cow cow = new Whale();
        System.out.println(cow.getName());
    }
    public static class Cow
    {
        public String getName()
        {
            return "Я - корова";
        }
    }
    public static class Whale extends Cow
    {
        public String getName()
        {
            return "Я не корова, Я - кит.";
        }
    }
}
