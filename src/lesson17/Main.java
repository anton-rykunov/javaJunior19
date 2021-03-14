package lesson17;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbs = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        numbs.add(2);
        numbs.add(10);
        numbs.add(18);
        numbs.add(65);
        numbs.add(23);
        numbs.add(2);
        for(Integer n:numbs)
        System.out.print(n + "  ");
    }
}
