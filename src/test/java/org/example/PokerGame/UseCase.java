package org.example.PokerGame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class UseCase {

    @Test
    public void happyPathPlayer1Win() {

        var deck = new PokerDeck(List.of(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.HEART),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE),
                new Card(1, CardMark.HEART),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE),
                new Card(5, CardMark.HEART),
                new Card(1, CardMark.SPADE),
                new Card(2, CardMark.DIAMOND),
                new Card(3, CardMark.SPADE),
                new Card(4, CardMark.DIAMOND),
                new Card(5, CardMark.SPADE),
                new Card(10, CardMark.SPADE)
        ));
        var players = PokerGame.start(3, deck);

        players.get(1).throwCard(0);
        PokerGame.draw(players.get(1), deck);

        assertThat(PokerGame.finish(players)).isEqualTo("The winner is player 1!!");
    }

    @Test
    public void happyPathPlayer2WinByDrawingGoodCard() {

        var deck = new PokerDeck(List.of(
                new Card(1, CardMark.SPADE),
                new Card(1, CardMark.HEART),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE),
                new Card(1, CardMark.HEART),
                new Card(2, CardMark.SPADE),
                new Card(3, CardMark.DIAMOND),
                new Card(4, CardMark.SPADE),
                new Card(5, CardMark.HEART),
                new Card(1, CardMark.SPADE),
                new Card(2, CardMark.DIAMOND),
                new Card(3, CardMark.SPADE),
                new Card(4, CardMark.DIAMOND),
                new Card(5, CardMark.SPADE),
                new Card(10, CardMark.SPADE),
                new Card(2, CardMark.SPADE)
        ));
        var players = PokerGame.start(3, deck);

        players.get(0).throwCard(0);
        players.get(1).throwCard(0);
        PokerGame.draw(players.get(1), deck);
        // MEMO: test failed because we don't implement pokerGame.draw method
        assertThat(PokerGame.finish(players)).isEqualTo("The winner is player 2!!");
    }
}
