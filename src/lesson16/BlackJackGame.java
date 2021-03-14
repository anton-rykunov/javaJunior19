package lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Coloda coloda = new Coloda();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void doFirstRound() {
        for (int i = 0; i < 2; i++) {
            for (Player p : players) {
                p.addCardToHand(coloda.getRandomCard());
            }
        }
    }

    public void doSecondRound() {
        for (Player p : players) {
            this.addCardsIfNeed(p);
        }
    }

    public void addCardsIfNeed(Player player) {
        String answer = player.needsCard();
        if (answer.equals("да")) {
            player.addCardToHand(coloda.getRandomCard());
            this.addCardsIfNeed(player);
        }
    }

    public void printWinner() {
        for (Player p : players) {
            if (p.totalHandsValue() > 21) {
                p.setWinner((false));
            }
        }
        int winnerValue = this.maxHandsValue();
        for (Player p : players) {
            if (p.totalHandsValue() == winnerValue) {
                System.out.println("------ВЫИГАЛ------");
                p.printHand();
                System.out.println("------------------");
            } else {
                System.out.println("------ПРОИГРАЛ------");
                p.printHand();
                System.out.println("------------------");
            }
        }


    }

    private int maxHandsValue() {
        int maxValue = 0;
        for (Player p : players) {
            if (p.totalHandsValue() > maxValue && p.isWinner()) {
                maxValue = p.totalHandsValue();
            }
        }
        return maxValue;
    }
}
