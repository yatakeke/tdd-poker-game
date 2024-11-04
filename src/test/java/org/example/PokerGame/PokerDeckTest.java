package org.example.PokerGame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokerDeckTest {

    @Test
    @Disabled
    public void testDraw() {
        var deck = PokerDeck.init();
        var firstTopCard = deck.draw();
        var secondTopCard = deck.draw();

        assertThat(firstTopCard).isEqualTo(new Card(1, CardMark.DIAMOND));
        assertThat(secondTopCard).isEqualTo(new Card(2, CardMark.DIAMOND));
        assertThat(deck.size()).isEqualTo(52);
    }

}