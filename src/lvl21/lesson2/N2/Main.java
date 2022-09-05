package lvl21.lesson2.N2;


import java.util.HashSet;
import java.util.Set;

public class Main {
    private final String first, last;

    public Main(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false;

        if (!(o instanceof Main)){
            return false;
        }

        if (this == o) return true;

        Main solution = (Main) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Main> s = new HashSet<>();
        s.add(new Main("Mickey", "Mouse"));
        System.out.println(s.contains(new Main("Mickey", "Mouse")));
    }
}

