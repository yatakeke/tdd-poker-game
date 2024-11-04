package org.example.PokerGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final ArrayList<Card> allCard;

    public Player(Card card1, Card card2, Card card3, Card card4, Card card5) {
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
}
