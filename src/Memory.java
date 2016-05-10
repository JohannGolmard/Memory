/**
 * Application that launches a Memory game
 * @author golmardj
 *
 */
public class Memory
{

	/**
	 * Application's main
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args)
	{	
		try
		{
			new MemoryGame(2).play();
		}
		catch (InvalidSizeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
