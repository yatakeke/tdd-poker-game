package org.example.PokerGame;

import org.example.PokerGame.Hands;
import org.example.PokerGame.PokerHandJudge;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PokerHandJudgeTest {

    @Test
    public void testOnePair() {
        Hands Hands = new Hands(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.CLUB),
                new Card(2, CardMark.HEART),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE)
        );
        var result = new PokerHandJudge().judge(Hands);
        assertThat(result).isEqualTo(PokerHand.ONE_PAIR);
    }

}