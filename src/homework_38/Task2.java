package homework_38;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D", "E", "F"));

        System.out.println("SetUtils.union : " + union(set1, set2));
        System.out.println("SetUtils.intersection : " + intersection(set1, set2));
        System.out.println("SetUtils.difference : " + difference(set1, set2));
    }
}
