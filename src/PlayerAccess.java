import java.util.Scanner;
/**
 * This class represents an access of a position choose by the player
 * @author golmardj
 *
 */
public class PlayerAccess
{
	/**
	 * The position to initiate
	 */
	private Position pos;
	/**
	 * Initiate the position with parameters that the player enter.
	 */
	public PlayerAccess(){
		System.out.println("Saisissez les coordonnées (x et y)");
		int x,y;
		Scanner sc= new Scanner(System.in);		
		x=sc.nextInt();
		y=sc.nextInt();		
		
		this.pos=new Position(x, y);
	}
	/** Return the position
	 * @return pos
	 */
	public Position askPosition(){
		return this.pos;
	}

}
