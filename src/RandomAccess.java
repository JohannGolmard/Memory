import java.util.Random;

/**
 * This class represents a random access of a position
 * @author golmardj
 *
 */
public class RandomAccess
{
	/**
	 * The position to initiate
	 */
	private Position pos;
	/**
	 * Initiate the position with random values
	 * @param index
	 */
	public RandomAccess(int index)
	{
		Random rand = new Random();		
		int x = rand.nextInt(index);
		int y = rand.nextInt(index);
		
		this.pos=new Position(x, y);
	}
	/**
	 * Return the position
	 * @return pos
	 */
	public Position askPosition(){
		return this.pos;
	}

}
