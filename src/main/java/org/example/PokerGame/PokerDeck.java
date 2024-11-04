package org.example.PokerGame;

public class PokerDeck {

    public static PokerDeck init() {
        return new PokerDeck();
    }

    public Card draw() {
        return new Card(1, CardMark.DIAMOND);
    }

    public Integer size() {
        return null;
    }
}
