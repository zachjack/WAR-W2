package GitExample;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zachj on 2017-01-11.
 */
public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards()
    {
        deck = new ArrayList<>();
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] faceNames = {"two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        for (String suit: suits)
        {
            for (int i=0; i < faceNames.length; i++)
            {
                Card newCard = new Card(faceNames[i], suit,i+2);
                deck.add(newCard);
            }
        }
    }
        public String toString()
        {
            String deckString = "";

            for (Card card : deck)
            {
                deckString += card.toString()+ "\n";
            }
            return deckString;
        }
        public void shuffle()
        {
            Collections.shuffle(deck);
        }
        public Card dealTopCard()
        {
            if (deck.isEmpty())
                return null;
            else
                return deck.remove(0);
        }
}
