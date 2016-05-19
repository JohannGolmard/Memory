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
			//TODO rajouter ce qui manque
			
		//	PositionRandom position1 = new PositionRandom(this.board.getGrids().length);
		//	PositionRandom position2 = new PositionRandom(this.board.getGrids().length);
			PositionAsked position1 = new PositionAsked();
			PositionAsked position2 = new PositionAsked();
			
			System.out.println(position1.toString());
			System.out.println(position2.toString());
			if(!position1.checkPosition(position2)){
				if(!this.board.isVisible(position1)){
					if(!this.board.isVisible(position2)){
					
			
						this.board.getGrids()[position1.getRow()][position1.getColumn()].setSide(true);
						System.out.println("\nCarte sélectionnée n°1 : "+this.board.getGrids()[position1.getRow()][position1.getColumn()].getValue()+"\n");
						this.board.getGrids()[position2.getRow()][position2.getColumn()].setSide(true);
						System.out.println("\nCarte sélectionnée n°2 : "+this.board.getGrids()[position2.getRow()][position1.getColumn()].getValue()+ "\n");
			
						if(!this.board.checkCards(position1, position2)){
							this.board.getGrids()[position1.getRow()][position1.getColumn()].setSide(false);
							this.board.getGrids()[position2.getRow()][position2.getColumn()].setSide(false);
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
