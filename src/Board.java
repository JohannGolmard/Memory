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
	 * @param line
	 *            , index of line for the first card
	 * @param col
	 *            , index of column for the first card
	 * @param line2
	 *            , index of line for the second card
	 * @param col2
	 *            , index of column for the second card
	 * @return boolean
	 */
	public boolean checkCards(int line, int col, int line2, int col2)
	{
		if (this.getGrids()[line][col].getValue() == this.getGrids()[line2][col2].getValue())
				return true;
		else
				return false;

	}
	public boolean isVisible(int line,int col){
		if(this.grids[line][col].getSide())
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
				s = s + " " + this.grids[j][i].toString();

			}
			s = s + "\n";
		}
		return s;
	}
}
