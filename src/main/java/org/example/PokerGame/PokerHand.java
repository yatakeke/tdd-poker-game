package org.example.PokerGame;

public enum PokerHand {
    HIGH_CARD("HIGH_CARD", 0),
    ONE_PAIR("ONE_PAIR", 1);

    private final String pokerHand;
    private final Integer rank;

    private PokerHand(String pokerHand, Integer rank) {
        this.pokerHand = pokerHand;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.pokerHand;
    }

    public Integer getRank() {
        return this.rank;
    }
}
