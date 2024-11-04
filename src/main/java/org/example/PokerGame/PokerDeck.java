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
        var card = this.cardList.get(0);
        this.cardList = this.cardList.subList(1, this.cardList.size());
        return card;
    }

    public Integer size() {
        return this.cardList.size();
    }
}
