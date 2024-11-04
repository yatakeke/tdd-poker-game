package org.example.PokerGame;

import java.util.ArrayList;

public class PokerHandJudge {

    public PokerHand judge(Player player) {
        var numbers = new ArrayList<Integer>();
        for (var card: player.allCard()) {
            if (numbers.contains(card.number())) {
                return PokerHand.ONE_PAIR;
            }
            else {
                numbers.add(card.number());
            }
        }
        return PokerHand.HIGH_CARD;
    }
}
