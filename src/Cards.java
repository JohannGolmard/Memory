/**
 * This class represents a card from the game Memory. Each card is represent by a attribute.
 * 
 * @author golmardj
 *
 */
public class Cards
{
	/**
	 * 
	 */
	private final int value;
	
	/**
	 * @param nbr
	 */
	public Cards(int nbr){
		this.value =nbr; 
	}
	
	/**
	 * @return value
	 */
	public int getValue(){
		return this.value;
	}
	
}
