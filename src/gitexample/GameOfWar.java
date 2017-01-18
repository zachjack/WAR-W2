package gitexample;

import java.util.ArrayList;

/**
 *
 * @author zachj
 */
public class GameOfWar {
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    
    public GameOfWar()
    {
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        
        DeckOfCards theDeck = new DeckOfCards();
        
    }
}
