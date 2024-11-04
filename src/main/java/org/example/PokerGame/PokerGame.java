package org.example.PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    public static List<Player> start(Integer playerNumber, List<Card> deck) {
        return null;
    }

    public static Player throwCard(Player player) {
        return null;
    }
    public static Player draw(Player player, List<Card> deck) {
        return null;
    }

    public static String finish(List<Player> players) {

        var pokerHandsJudge = new PokerHandJudge();

        var pokerHands = new ArrayList<Integer>();
        for (var player: players) {
            pokerHands.add(pokerHandsJudge.judge(player).getRank());
        }

        var winner = getWinner(pokerHands);
        return String.format("The winner is player %s!!", winner);
    }

    private static Integer getWinner(List<Integer> handsRank) {
        var maxItem = Collections.max(handsRank);
        return handsRank.indexOf(maxItem) + 1;
    }
}
