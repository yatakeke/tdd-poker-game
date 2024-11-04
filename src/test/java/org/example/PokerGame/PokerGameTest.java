package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class PokerGameTest {
    @Test
    public void testPlayer1WinByOnePair() {
        var player1 = new Player(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.HEART),
                new Card(2, CardMark.DIAMOND),
                new Card(3, CardMark.CLUB),
                new Card(4, CardMark.SPADE)
        );
        var player2 = new Player(
                new Card(1, CardMark.SPADE),
                new Card(5, CardMark.HEART),
                new Card(2, CardMark.DIAMOND),
                new Card(3, CardMark.CLUB),
                new Card(4, CardMark.SPADE)
        );
        // MEMO: both player didn't throw card

        var game = PokerGame.start(2);
        var players = List.of(player1, player2);
        var result = game.play(players);
        assertThat(result).isEqualTo("The winner is player 1!!");
    }
}