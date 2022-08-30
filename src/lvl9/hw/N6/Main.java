package lvl9.hw.N6;


import java.util.ArrayList;

public class Main {
    static hood Hood = new hood();
    static grandmother Grandmother = new grandmother();
    static Patty patty = new Patty();
    static Woodman woodman = new Woodman();
    static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(Hood);
        wolf.ate.add(Grandmother);
        woodman.killed.add(wolf);

    }

    public static class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate  = new ArrayList<StoryItem>();
    }

    public static class hood extends StoryItem{

    }

    public static class grandmother extends StoryItem{

    }

    public static class Patty extends StoryItem{

    }

    public static class Woodman extends StoryItem{

    }

    public static class Wolf extends StoryItem{

    }

}
