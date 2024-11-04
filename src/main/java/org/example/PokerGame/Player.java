package org.example.PokerGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player {
    private final ArrayList<Card> allCard;

    public static Player init(List<Card> cardList) {
        return new Player(cardList.get(0), cardList.get(1),cardList.get(2),cardList.get(3),cardList.get(4));
    }

    private Player(Card card1, Card card2, Card card3, Card card4, Card card5) {
        this.allCard = new ArrayList<>();
        allCard.add(card1);
        allCard.add(card2);
        allCard.add(card3);
        allCard.add(card4);
        allCard.add(card5);
    }

    public List<Card> allCard() {
        return this.allCard;
    }

    public void throwCard(int index) {
        this.allCard.remove(index);
    }

    public void throwCard(Integer... indices) {
        List<Integer> indicesList = Arrays.asList(indices);
        indicesList.sort(Collections.reverseOrder());
        for (var i: indicesList) {
            this.throwCard(i);
        }
    }
}
