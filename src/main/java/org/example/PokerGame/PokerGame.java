package org.example.PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    public static List<Player> start(Integer playerNumber, PokerDeck deck) {
        var result = new ArrayList<Player>();
        for (var i = 0; i < playerNumber; i++) {
            result.add(Player.init(List.of(
                    deck.draw(),
                    deck.draw(),
                    deck.draw(),
                    deck.draw(),
                    deck.draw()
            )));
        }
        return result;
    }

    public static Player throwCard(Player player) {
        return null;
    }
    public static void draw(Player player, PokerDeck deck) {
        // TODO: implemented code from here
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
