package lvl21.lesson3.N1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main implements Cloneable {
    public static void main(String[] args)  {
        Main solution = new Main();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Main clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
            solution.users.clear();
            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }
    protected Map<String, User> users = new LinkedHashMap();
    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return new User(this.age, this.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return name.equals(user.name);
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + name.hashCode();
            return result;
        }
    }

    @Override
    protected Main clone() throws CloneNotSupportedException {
        Main newMain = new Main();
        newMain.users = new LinkedHashMap();
        newMain.users.putAll(users);
        return newMain;
    }
}
