/**
 * This class represents a card from the game Memory. Each card is represent by
 * two attributes : the value of the card and his side.
 * 
 * @author golmardj
 *
 */
public class Card
{	
	/**
	 * The default side of a card. False represents the hidden side of a card.
	 */
	public static final boolean DEFAULT_SIDE = false;
	// TODO write comment(done)
	/**
	 * The value of the card
	 */
	private final int value;
	/**
	 * The side of the card
	 */
	private boolean side;
	/**
	 * The button of the card represented on the player screen.
	 */
	private Button button;
	
	
	// TODO write comment(done)
	/** Creates a new Card with a value and a side initiate by default.
	 * @param nbr
	 */
	public Card(int nbr)
	{
		this.value = nbr;
		this.side = DEFAULT_SIDE;
		this.button= new Button();
	}

	// TODO write comment(done)
	/** Return the value of the card
	 * @return value
	 */
	public int getValue()
	{
		return this.value;
	}
	/**Return the side of a card
	 * @return side
	 */
	public boolean getSide(){
		return this.side;
	}
	/**
	 * Change the side of a card
	 * @param otherSide
	 */
	public void setSide(boolean otherSide){
		this.side=otherSide;
	}
	/**
	 * return a string with the value and the side of a card
	 */
	public String toString(){
		if(this.getSide())
			return " $"+this.value+"$ ";
		else
			return " X"+this.value+"X ";
	}

}
