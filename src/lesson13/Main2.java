package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(23);
        set.add(13);
        set.add(13);
        set.add(15);
        set.add(11);
        set.add(1);
        set.add(15);
        set.add(15);
        set.add(12);

        //Генерация индекса
        for(int i = 0; i < set.size(); i ++){
            System.out.print(set.get(i) + "  ");
        }
        System.out.println();
        //Цикл for each
        for(Integer num:set){
            System.out.print(num + "  ");
        }
        System.out.println();
        // С помощью итератора
        for(Iterator<Integer> iter = set.iterator();iter.hasNext();){
            System.out.print(iter.next() + "  ");
        }


    }
}
