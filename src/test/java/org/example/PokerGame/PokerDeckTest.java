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
        assertThat(deck.size()).isEqualTo(50);
    }

    @Test
    public void testShuffle() {
        var deck = PokerDeck.init();
        deck.shuffle(1);

        assertThat(deck.draw()).isNotEqualTo(new Card(1, CardMark.SPADE));
        assertThat(deck.draw()).isEqualTo(new Card(1, CardMark.CLUB));

        assertThat(deck.draw()).isNotEqualTo(new Card(2, CardMark.SPADE));
        assertThat(deck.draw()).isEqualTo(new Card(7, CardMark.CLUB));
    }

}