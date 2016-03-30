/**
 * This class represents a card from the game Memory. Each card is represent by
 * two attributes : the value of the card and his side.
 * 
 * @author golmardj
 *
 */
public class Cards
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

	// TODO write comment(done)
	/** Creates a new Card with a value and a side initiate by default.
	 * @param nbr
	 */
	public Cards(int nbr)
	{
		this.value = nbr;
		this.side = DEFAULT_SIDE;
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

}
