/**
 * This class represents the position of a card. It generate a random position for each card.
 * @author golmardj
 *
 */
public class Position
{
	/**
	 * represents coordinates x
	 */
	private int row;
	/**
	 * represents coordinate y
	 */
	private int column;
	/**
	 * Create a new position 
	 * @param x
	 * @param y
	 */
	public Position(int x,int y){
		this.row=x;
		this.column=y;
	}
	/**
	 * return row
	 * @return row
	 */
	public int getRow(){
		return this.row;
	}
	/**
	 * return column
	 * @return column
	 */
	public int getColumn(){
		return this.column;
	}
	/**
	 * Check if the position is the same of another position
	 * @param pos2
	 * @return boolean
	 */
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
