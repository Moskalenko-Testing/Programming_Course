package homework_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionHm {
    public static void main(String[] args) {
        Collection<Integer> colA = new ArrayList<>(List.of(10, 20, 30, 20, 40, 50, 60));
        Collection<Integer> colB = new ArrayList<>(List.of(20, 30, 40));

        Collection<Integer> result = new ArrayList<>(colA);
        result.retainAll(colB);

        System.out.println(result);
    }
}
