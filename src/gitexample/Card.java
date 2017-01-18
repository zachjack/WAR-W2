package GitExample;

/**
 * Created by zachj on 2017-01-11.
 */
public class Card {
    private String faceName, suit;
    private int faceValue;

    public Card(String face, String suit, int value)
    {
        faceName = face;
        setSuit(suit);
        setValue(value);
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }



    private void setValue(int value)
    {
        if (value < 2 || value > 14)
            throw new IllegalArgumentException("Nah, 2-14 only");
        else
            faceValue = value;
    }

    /**
     * This will validate if the suit is valid (i.e. hearts, spades etc.)
     */
    private void setSuit(String suit)
    {
        if (suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds") ||
                suit.equalsIgnoreCase("spades") || suit.equalsIgnoreCase("clubs"))
        {
            this.suit = suit;
        }
        else
            throw new IllegalArgumentException(("suit must be a real one."));
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
