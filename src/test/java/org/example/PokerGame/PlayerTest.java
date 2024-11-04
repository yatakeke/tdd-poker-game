package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void canThrowSingleCard() {
        var player = playerWithOnePair();
        player.throwCard(3);
        assertThat(player.allCard()).hasSize(4);
    }

    @Test
    public void canThrowMultiCard() {
        var player = playerWithOnePair();
        player.throwCard(3, 4);
        assertThat(player.allCard()).hasSize(3);
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