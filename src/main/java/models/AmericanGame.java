package models;

/**
 * Created by krisna on 2/19/2016.
 */
public class AmericanGame extends Game
{
    @Override
    public void buildDeck()
    {
        for(int i = 2; i < 15; i++)
        {
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));

        }
    }
}
