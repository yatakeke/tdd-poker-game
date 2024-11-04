package org.example.PokerGame;

import java.util.ArrayList;
import java.util.List;

public class PokerGame {
    public static PokerGame start(Integer playerNumber) {
        return new PokerGame();
    }

    public String play(List<Player> players) {

        var pokerHandsJudge = new PokerHandJudge();

        var pokerHands = new ArrayList<PokerHand>();
        for (var player: players) {
            pokerHands.add(pokerHandsJudge.judge(player));
        }

        var winner = 1;
        return String.format("The winner is player %s!!", winner);
    }
}
