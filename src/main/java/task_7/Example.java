package task_7;

import java.util.HashSet;
import java.util.Set;

class Example {
    private final String first;
    private final String last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        if (first != null ? !first.equals(example.first) : example.first != null) return false;
        return last != null ? last.equals(example.last) : example.last == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }
}
