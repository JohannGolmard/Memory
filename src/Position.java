import java.util.Random;

/**
 * This class represents the position of a card. It generate a random position for each card.
 * @author golmardj
 *
 */
public class Position
{
	private int row;
	private int column;
	
	public Position(int index){
		Random rand = new Random();
		
		this.row = rand.nextInt(index);
		this.column = rand.nextInt(index);
	}
	public int getRow(){
		return this.row;
	}
	public int getColumn(){
		return this.column;
	}
	public boolean checkPosition(Position pos2){
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
