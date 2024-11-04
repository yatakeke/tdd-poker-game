package org.example.PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerDeck {

    private List<Card> cardList;

    public PokerDeck(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Card draw() {
        var card = this.cardList.get(0);
        this.cardList = this.cardList.subList(1, this.cardList.size());
        return card;
    }

    public void shuffle(int seed) {
        Collections.shuffle(this.cardList, new Random(seed));
    }

    public void shuffle() {
        Collections.shuffle(this.cardList);
    }

    public Integer size() {
        return this.cardList.size();
    }

    public static PokerDeck init() {
        var cardList = new ArrayList<Card>();

        for (var i = 1; i <= 13; i++) {
            cardList.add(new Card(i, CardMark.SPADE));
        }

        for (var i = 1; i <= 13; i++) {
            cardList.add(new Card(i, CardMark.HEART));
        }

        for (var i = 1; i <= 13; i++) {
            cardList.add(new Card(i, CardMark.CLUB));
        }

        for (var i = 1; i <= 13; i++) {
            cardList.add(new Card(i, CardMark.DIAMOND));
        }

        // TODO: added joker

        return new PokerDeck(cardList);
    }
}
