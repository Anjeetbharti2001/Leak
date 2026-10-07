import java.util.*;

public class Stars {

    private final String first, last;

    public Stars(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Stars))
            return false;

        Stars n = (Stars) o;
        return n.first.equals(first) && n.last.equals(last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String args[]) {

        Set<Stars> s = new HashSet<Stars>();

        s.add(new Stars("Shubham", "Juneja"));

        System.out.println(
            s.contains(new Stars("Shubham", "Juneja"))
        );
    }
}