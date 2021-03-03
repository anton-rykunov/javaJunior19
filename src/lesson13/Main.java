package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<>();
        text.add("qqqq");
        text.add("wwww");
        text.add("eeeee");

        text.add(0, "!!!!");
        text.set(1, "QQQQ");

        System.out.println(text.toString());
        System.out.println(text.size());
        System.out.println(text.contains("!!!!"));
        System.out.println(text.get(2));
        System.out.println(text.remove(0));
        System.out.println(text);




    }
}
