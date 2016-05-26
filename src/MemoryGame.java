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
	 * A timer sets when the game start
	 */
	private long starttimer;
	/**
	 * A timer sets when the game end
	 */
	private long endtimer;
	

	/**
	 * Creates a new Memory game, with a standard board initiate by a size
	 * @param size , the size of the board
	 * @throws InvalidSizeException 	 * 
	 */
	public MemoryGame(int size) throws InvalidSizeException
	{
			this.board = new Board(size);
			this.starttimer=System.currentTimeMillis();
			this.endtimer=0;
	}

	/**
	 * play is a method which represents a game being played by the user.
	 * 
	 * while( game hasn't finish)
	 *      do
	 *      {
	 * 			ask the player for 2 positions of card
	 *		}
	 *		while (card selection is not valid)
	 * 		if( card != visible)
	 * 			return the side and display the value of each card
	 * 			if( not same value ) 
	 * 				return the side of each card to the hidden side
	 * 				return to the player that the cards are not the same
	 * 			else
	 * 				left the card to the visible side
	 */
	public void play()
	{
		
		while(!this.board.getEndOfBoard()){
			
			
		//	RandomAccess pa = new RandomAccess(this.board.getGrids().length);
		//	RandomAccess pa2 = new RandomAccess(this.board.getGrids().length);
			PlayerAccess pa = new PlayerAccess();
			PlayerAccess pa2 = new PlayerAccess();
			
			System.out.println(pa.askPosition().toString());
			System.out.println(pa2.askPosition().toString());
			if(!pa.askPosition().checkPosition(pa2.askPosition())){
				if(!this.board.isVisible(pa.askPosition())){
					if(!this.board.isVisible(pa2.askPosition())){
					
			
						this.board.getGrids()[pa.askPosition().getRow()][pa.askPosition().getColumn()].setSide(true);
						System.out.println("\nCarte sélectionnée n°1 : "+this.board.getGrids()[pa.askPosition().getRow()][pa.askPosition().getColumn()].getValue()+"\n");
						this.board.getGrids()[pa2.askPosition().getRow()][pa2.askPosition().getColumn()].setSide(true);
						System.out.println("\nCarte sélectionnée n°2 : "+this.board.getGrids()[pa2.askPosition().getRow()][pa.askPosition().getColumn()].getValue()+ "\n");
			
						if(!this.board.checkCards(pa.askPosition(), pa2.askPosition())){
							this.board.getGrids()[pa.askPosition().getRow()][pa.askPosition().getColumn()].setSide(false);
							this.board.getGrids()[pa2.askPosition().getRow()][pa2.askPosition().getColumn()].setSide(false);
							System.out.println("\nCartes différentes\n");
			}
			
		}
		}
		}
			System.out.println(this.board.toString());
	}
		this.getTime();

	}
	
	
	
	/** Return a timer
	 * @return timer
	 */
	public long getTime(){
		long min;
		long sec;
		
		this.endtimer=System.currentTimeMillis();
		min=(this.endtimer-this.starttimer)/1000 / 60;
		sec=(this.endtimer-this.starttimer)/1000 % 60;
		
		return min & sec;
		
	}

}
