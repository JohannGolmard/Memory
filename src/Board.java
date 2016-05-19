import java.util.Random;

/**
 * This class represents a board of the Memory game. The board is filled with
 * cards.
 * 
 * @author golmardj
 *
 */
public class Board
{
	/**
	 * A 2D grid of card
	 */
	private Card[][] grids;

	/**
	 * Creates a new Board with randomly placed cards on the hidden side.
	 * 
	 * @param size
	 * @throws InvalidSizeException
	 */
	public Board(int size) throws InvalidSizeException
	{
		if ((size * size) % 2 == 1)
			throw new InvalidSizeException();

		Random rand = new Random();
		this.grids = new Card[size][size];
		
		int numberOfPairs = ((int) (Math.pow(this.grids.length, 2))) / 2;
		
		for (int pairIndex = 0; pairIndex < numberOfPairs; pairIndex++)
		{			
			while (true)
			{
				int rowIndex = rand.nextInt(this.grids.length);
				int columnIndex = rand.nextInt(this.grids[0].length);
				
				if (this.grids[rowIndex][columnIndex] == null) 
				{
					this.grids[rowIndex][columnIndex] = new Card(pairIndex);
					break;
				}
			}
			
			while (true)
			{
				int rowIndex = rand.nextInt(this.grids.length);
				int columnIndex = rand.nextInt(this.grids[0].length);
				
				if (this.grids[rowIndex][columnIndex] == null) 
				{
					this.grids[rowIndex][columnIndex] = new Card(pairIndex);
					break;
				}
			}
		}
	}

	/**
	 * Return the grids
	 * 
	 * @return grids
	 */
	public Card[][] getGrids()
	{
		return this.grids;
	}

	/**
	 * check the state of the board
	 * 
	 * @return boolean , false if the board isn't finish or true
	 */
	public boolean getEndOfBoard()
	{
		for (int i = 0; i < this.grids.length; i++)
		{
			for (int j = 0; j < this.grids[i].length; j++)
			{
				if (!this.grids[i][j].getSide())
					return false;
			}
		}
		return true;

	}

	/**
	 * Check the value of two cards and return if they are equals
	 * 
	 * @param pos1
	 *            Position of one card
	 * @param pos2
	 *            Position of another card
	 * 
	 * @return boolean
	 */
	public boolean checkCards(PositionAsked pos1,PositionAsked pos2)
	{
		if (this.getGrids()[pos1.getRow()][pos1.getColumn()].getValue() == this.getGrids()[pos2.getRow()][pos2.getColumn()].getValue())
				return true;
		else
				return false;

	}
	/**
	 * Check a card if it's visible
	 * @param pos1
	 * @return a boolean
	 */
	public boolean isVisible(PositionAsked pos1){
		if(this.grids[pos1.getRow()][pos1.getColumn()].getSide())
			return true;
		else
			return false;
				
	}

	/**
	 * returns a string with all the values in the board grid
	 */
	public String toString()
	{
		String s = "";
		for (int i = 0; i < this.grids.length; i++)
		{
			for (int j = 0; j < this.grids[i].length; j++)
			{
				s = s + " " + this.grids[i][j].toString();

			}
			s = s + "\n";
		}
		return s;
	}
}
