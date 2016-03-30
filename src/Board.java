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
	private Cards grids[][];

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
		this.grids[size][size];
		for (int lineIndex = 0; lineIndex < this.grids.length; lineIndex++)
		{
			for (int colIndex = 0; colIndex < this.grids[lineIndex].length; colIndex++)
			{

				Random rand = new Random();
				int rng = rand.nextInt((int) (Math.pow(this.grids.length, 2) / 2));
				int rnjesus = rand.nextInt(this.grids.length);
				int r3d3 = rand.nextInt(this.grids[lineIndex].length);

				Cards card1 = new Cards(rng);
				Cards card2 = new Cards(rng);

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
	public Cards[][] getGrids(){
		return this.grids;
	}
	
}
