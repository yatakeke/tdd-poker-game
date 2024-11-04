package org.example.PokerGame;

import org.example.PokerGame.Hands;
import org.example.PokerGame.PokerHandJudge;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PokerHandJudgeTest {

    @Test
    public void testOnePair() {
        Hands Hands = new Hands(
                new Card(1, "spade"),
                new Card(1, "club"),
                new Card(2, "heart"),
                new Card(3, "diamond"),
                new Card(4, "spade")
        );
        String result = new PokerHandJudge().judge(Hands);
        assertThat(result).isEqualTo("One Pair");
    }

}