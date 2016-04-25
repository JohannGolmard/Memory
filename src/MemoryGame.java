import java.util.Scanner;


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
	 * @throws InvalidSizeException 
	 * 
	 */
	public MemoryGame(int size) throws InvalidSizeException
	{
		// TODO do not use javadoc style comment inside code(done)
	
			this.board = new Board(size);
			this.starttimer=System.currentTimeMillis();
			this.endtimer=0;
	}

	/**
	 * play is a method which represents a game being played by the user.
	 */
	public void play()
	{
		// TODO write code
		
		while(!this.getBoard().getEndOfBoard()){
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			
			int line1 = sc1.nextInt();
			int col1 = sc2.nextInt();
			int line2 = sc3.nextInt();
			int col2 = sc4.nextInt();
			
			this.getBoard().getGrids()[line1][col1].setSide(true);
			System.out.println("\nCarte sélectionnée n°1 : "+this.getBoard().getGrids()[line1][col1].getValue()+"\n");
			this.getBoard().getGrids()[line2][col2].setSide(true);
			System.out.println("\nCarte sélectionnée n°2 : "+this.getBoard().getGrids()[line2][col2].getValue()+"\n");
			
			
			if(!this.getBoard().checkCards(line1, col1, line2, col2)){
				this.getBoard().getGrids()[line1][col1].setSide(false);
				this.getBoard().getGrids()[line2][col2].setSide(false);
				System.out.println("\nCartes différentes\n");
			}
			
				
		}
		this.getTime();

	}
	/**
	 * Return a board
	 * @return board
	 */
	public Board getBoard()
	{
		return this.board;
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
