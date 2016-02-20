package models;

/**
 * Created by krisna on 2/19/2016.
 */
public class SpanishGame extends Game
{
    @Override
    public  void buildDeck()
    {
        for (int i = 1; i < 11; i++)
        {
            
            deck.add(new Card(i, Suit.Coins));
            deck.add(new Card(i, Suit.Cups));
            deck.add(new Card(i, Suit.Swords));
            deck.add(new Card(i, Suit.Carrots));
        }
    }
}
