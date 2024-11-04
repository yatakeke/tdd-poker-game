package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PokerDeckTest {

    @Test
    public void testDraw() {
        var deck = PokerDeck.init();
        var firstTopCard = deck.draw();
        var secondTopCard = deck.draw();

        assertThat(firstTopCard).isEqualTo(new Card(1, CardMark.SPADE));
        assertThat(secondTopCard).isEqualTo(new Card(2, CardMark.SPADE));
        assertThat(deck.size()).isEqualTo(0);
    }

}