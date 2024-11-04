package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class PokerGameTest {
    @Test
    public void testPlayer1WinByOnePair() {

        var players = List.of(playerWithOnePair(), playerWithHighCard());
        assertThat(PokerGame.finish(players)).isEqualTo("The winner is player 1!!");
    }

    private static Player playerWithHighCard() {
        return new Player(
                new Card(1, CardMark.SPADE),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.CLUB),
                new Card(5, CardMark.HEART)
        );
    }

    private static Player playerWithOnePair() {
        return new Player(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.CLUB),
                new Card(2, CardMark.HEART),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE)
        );
    }
}