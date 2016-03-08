/**
 *This class represents a Memory game.
 * MemoryGame is a game from Memory which is ready to play, the cards was placed on a grid,
 * on the hidden side. The player has a timer that start from 0 and stop 
 * when the player win the game.
 * The player can flip 2 cards on the grid, on the other side.
 * If they are similar, these cards stay on the visible side. 
 * 
 * @author golmardj
 *
 */
public class MemoryGame
{
	private Cards[][] grids=null;
	// TODO update comment (what is a "ready to be played" game?)(done)
	/**
	 * Creates a new Memory game, with their cards initiate on a board. (explain the attributes)
	 */
	public MemoryGame()
	{	
		// TODO write code
		for(int i=0;i<grids.length;i++){
			int j;
				for(j=0;j<grids[i].length;j++){
					Cards card = new Cards();
				}
		}
	}
	
	// TODO rename this method (ask for advice)(done)
	/**
	 * play is a method which represents a game being played by the user.
	 */
	public void play()
	{
		// TODO write code
		
	}

}
