import java.util.Random;

/**
 * This class represents a Memory game. MemoryGame is a game from Memory which
 * is ready to play, the cards was placed on a grid, on the hidden side. The
 * player has a timer that start from 0 and stop when the player win the game.
 * The player can flip 2 cards on the grid, on the other side. If they are
 * similar, these cards stay on the visible side.
 * 
 * @author golmardj
 *
 */
public class MemoryGame
{
	/**
	 * game board ()
	 */
	private Board board;

	/**
	 * Creates a new Memory game, with a standard board with randomly placed
	 * cards (hidden side) (explain the attributes)
	 * 
	 */
	public MemoryGame()
	{
		// TODO do not use javadoc style comment inside code
		/**
		 * Initiate the board with cards on each cell.
		 */
		this.board = new Board();

	}

	/**
	 * play is a method which represents a game being played by the user.
	 */
	public void play()
	{
		// TODO write code

	}

}
