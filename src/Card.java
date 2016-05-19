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
	
	/**
	 * The value of the card
	 */
	private final int value;
	/**
	 * The side of the card
	 */
	private boolean side;
	/**
	 *  The representation of the card on a graphical grid
	 */
	private Button but;
		
	/** Creates a new Card with a value, a side initiate by default and a Button.
	 * @param nbr
	 */
	public Card(int nbr)
	{
		this.value = nbr;
		this.side = DEFAULT_SIDE;
		this.but= new Button();
		
	}

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
	/**
	 * Return the reference of the button
	 * @return a button
	 */
	public Button getBut()
	{
		return this.but;
	}

}
