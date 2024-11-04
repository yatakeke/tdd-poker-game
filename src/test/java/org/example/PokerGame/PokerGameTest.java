package org.example.PokerGame;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class PokerGameTest {

    @Nested
    class GameFinish {
        @Test
        public void testPlayer1WinByOnePair() {

            var players = List.of(playerWithOnePair(), playerWithHighCard());
            assertThat(PokerGame.finish(players)).isEqualTo("The winner is player 1!!");
        }

        @Test
        public void testPlayer2WinByOnePair() {

            var players = List.of(playerWithHighCard(), playerWithOnePair(), playerWithHighCard());
            assertThat(PokerGame.finish(players)).isEqualTo("The winner is player 2!!");
        }
    }

    @Test
    public void testGameStartWithPlayers() {

        var deck = PokerDeck.init();
        var players = PokerGame.start(3, deck);

        assertThat(players).hasSize(3);
        assertThat(players.get(0).allCard()).hasSize(5);
        assertThat(players.get(1).allCard()).hasSize(5);
        assertThat(players.get(2).allCard()).hasSize(5);
    }

    private static Player playerWithHighCard() {
        return Player.init(
                List.of(
                        new Card(1, CardMark.SPADE),
                        new Card(2, CardMark.SPADE),
                        new Card(3, CardMark.DIAMOND),
                        new Card(4, CardMark.CLUB),
                        new Card(5, CardMark.HEART)
                )
        );
    }

    private static Player playerWithOnePair() {
        return Player.init(
                List.of(
                        new Card(1, CardMark.SPADE),
                        new Card(1, CardMark.CLUB),
                        new Card(2, CardMark.HEART),
                        new Card(3, CardMark.DIAMOND),
                        new Card(4, CardMark.SPADE)
                )
        );
    }
}