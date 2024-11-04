package org.example.PokerGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PokerHandJudgeTest {

    private PokerHandJudge pokerHandJudge;

    @BeforeEach
    void setUp() {
        this.pokerHandJudge = new PokerHandJudge();
    }

    @Test
    public void testOnePair() {
        Player player = new Player(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.CLUB),
                new Card(2, CardMark.HEART),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE)
        );
        assertThat(pokerHandJudge.judge(player)).isEqualTo(PokerHand.ONE_PAIR);
    }

    @Test
    public void testHighCard() {
        var player = new Player(
                new Card(1, CardMark.SPADE),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.CLUB),
                new Card(5, CardMark.HEART)
        );
        assertThat(pokerHandJudge.judge(player)).isEqualTo(PokerHand.HIGH_CARD);
    }
}