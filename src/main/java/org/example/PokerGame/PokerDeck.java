package org.example.PokerGame;

import java.util.List;

public class PokerDeck {

    private List<Card> cardList;

    public static PokerDeck init() {
        return new PokerDeck(
                List.of(
                        new Card(1, CardMark.SPADE),
                        new Card(2, CardMark.SPADE)
                )
        );
    }

    public PokerDeck(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Card draw() {
        return this.cardList.get(0);
    }

    public Integer size() {
        return null;
    }
}
