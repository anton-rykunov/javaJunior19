package lesson17;

import lesson14.Coin;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10,5, 1902, "Золото");
        Coin coin2 = new Coin(10,10, 1902, "Аллюминий");
        Coin coin3 = new Coin(1,5, 1902, "Платина");
        Coin coin4 = new Coin(10,5, 1902, "Медь");
        Coin coin5 = new Coin(10,5, 1902, "Железо");
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for(Coin c:coins){
            System.out.println(c);
        }

    }
}
