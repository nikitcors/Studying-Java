package lvl21.lesson2.N1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private final String first, last;

    public Main(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set<Main> s = new HashSet<>();
        s.add(new Main("Donald", "Duck"));
        System.out.println(s.contains(new Main("Donald", "Duck")));
    }

    @Override
    public int hashCode() {
        if (first == null) return 0;
        if (last == null) return 0;
        return first.length() + last.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (this == null) return false;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Main currentMain = (Main) obj;
        if (currentMain.first == null) return false;
        if (currentMain.last == null) return false;
        if (this.first == null) return false;
        if (this.last == null) return false;
        if ((currentMain.last.equals(this.last)) && ((currentMain.first.equals(this.first)))) return true;
        return false;
    }
}
