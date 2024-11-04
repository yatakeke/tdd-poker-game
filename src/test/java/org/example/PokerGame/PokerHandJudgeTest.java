package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PokerHandJudgeTest {

    @Test
    public void testOnePair() {
        Player Player = new Player(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.CLUB),
                new Card(2, CardMark.HEART),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE)
        );
        var result = new PokerHandJudge().judge(Player);
        assertThat(result).isEqualTo(PokerHand.ONE_PAIR);
    }

}