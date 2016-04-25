import java.util.Random;

// TODO write comment(done)
/**
 * This class represents a board of the Memory game. The board is filled with cards.
 * @author golmardj
 *
 */
public class Board
{
	// TODO write comment(done)
	/**
	 * A 2D grid of card
	 */
	private Card[][] grids;

	// TODO write comment(done)
	/**
	 * Creates a new Board with randomly placed
	 * cards on the hidden side.
	 * @param size 
	 * @throws InvalidSizeException 
	 */
	public Board(int size)throws InvalidSizeException
	{
		if ((size*size) % 2 == 1)
			throw new InvalidSizeException();
		else
		{
		this.grids = new Card[size][size];
		for (int lineIndex = 0; lineIndex < this.grids.length; lineIndex++)
		{
			for (int colIndex = 0; colIndex < this.grids[lineIndex].length; colIndex++)
			{

				Random rand = new Random();
				int rng = rand.nextInt((int) (Math.pow(this.grids.length, 2) / 2));
				int rnjesus = rand.nextInt(this.grids.length);
				int r3d3 = rand.nextInt(this.grids[lineIndex].length);

				Card card1 = new Card(rng);
				Card card2 = new Card(rng);

				if (!this.grids[lineIndex][colIndex].equals(card1) || !this.grids[lineIndex][colIndex].equals(card2))
				{
					this.grids[rnjesus][r3d3] = card1;
					this.grids[r3d3][rnjesus] = card2;
				}
				else
				{
					rnjesus = rand.nextInt(this.grids.length);
					r3d3 = rand.nextInt(this.grids[lineIndex].length);
				}

			}
		}
	}
	}
	
	/**
	 * Return the grids
	 * @return grids
	 */
	public Card[][] getGrids(){
		return this.grids;
	}
	/**
	 * check the state of the board
	 * @return boolean , false if the board isn't finish or true 
	 */
	public boolean getEndOfBoard(){
		for(int i=0;i<this.grids.length;i++){
			for(int j=0;j<this.grids[i].length;j++){
				if(!this.grids[i][j].getSide())
					return false;
			}
		}
		return true;
				
	}
	/**
	 * Check the value of two cards and return if they are equals
	 * @param line , index of line for the first card
	 * @param col , index of column for the first card
	 * @param line2 , index of line for the second card
	 * @param col2 , index of column for the second card
	 * @return boolean
	 */
	public boolean checkCards(int line, int col, int line2, int col2){
		if(this.getGrids()[line][col].getValue()==this.getGrids()[line2][col2].getValue())
			return true;
		else
			return false;
			
	}
	/**
	 * returns a string with all the values in the board grid
	 */
	public String toString(){
		String  s="";
		for(int i=0;i<this.grids.length;i++){
			for(int j=0;j<this.grids[i].length;j++){
				s=s +" "+ this.grids[i][j].toString();		
				
			}
		}
		return s;
}
}
