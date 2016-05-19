import java.util.Scanner;

/**
 * This class represents the position of a card. The position is asked to the player.
 * @author golmardj
 *
 */
public class PositionAsked
{
	private int row;
	private int column;
	
	public PositionAsked(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez les coordonnées ( x et y ) : ");
		this.row = sc.nextInt();
		//TODO voir avec HasNext
		this.column = sc.nextInt();
		
		sc.close();
	}
	public int getRow(){
		return this.row;
	}
	public int getColumn(){
		return this.column;
	}
	public boolean checkPosition(PositionAsked pos2){
		if(this.row == pos2.row && this.column == pos2.column)
			return true;
		else
			return false;
				
	}
	public String toString()
	{
		String s="";
		s = s+this.row +"et"+ this.column+"\n";
		return s;
	}
	
}
