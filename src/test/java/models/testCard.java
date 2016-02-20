package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/26/16.
 */
public class testCard {
    @Test
    public void testGetSuit(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals(Suit.Clubs,c.getSuit());
    }

    @Test
    public void testToString(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals("5Clubs",c.toString());
    }

    @Test
    public void testMoveAmericanCard(){
        Game g = new AmericanGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.move(0,2);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(0,g.cols.get(0).size());
    }

    @Test
    public void testMoveSpanishCard(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.move(0,2);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(0,g.cols.get(0).size());
    }

    @Test
    public void testCreateAmericanDeck()
    {
        Game american = new AmericanGame();
        american.buildDeck();
        american.shuffle();
        assertEquals(52, american.deck.size());
    }

    @Test
    public void testCreateSpanishDeck()
    {
        Game spanish = new SpanishGame();
        spanish.buildDeck();
        spanish.shuffle();
        assertEquals(40, spanish.deck.size());
    }

    @Test
    public void testDealSpanishDeck()
    {
        Game spanish = new SpanishGame();
        spanish.buildDeck();
        spanish.dealFour();
        assertEquals(36, spanish.deck.size());
    }

    @Test
    public void testDealAmericanDeck()
    {
        Game american = new AmericanGame();
        american.buildDeck();
        american.dealFour();
        assertEquals(48, american.deck.size());
    }

}
