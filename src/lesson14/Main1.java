package lesson14;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(4,4, 1900, "Золото");
        Coin coin2 = new Coin(4,4, 1900, "Золото");
        Coin coin3 = new Coin(4,4, 1900, "Золото");
        Coin coin4 = new Coin(7,5, 1400, "Золото");
        Coin coin5 = new Coin(5,25, 1700, "Золото");
        LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for(Coin coin:coins){
            System.out.println(coin);
        }
    }
}
