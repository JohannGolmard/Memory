import java.util.Random;


public class Board
{
	
	private Cards grids[][];

	public Board()
	{
		for(int lineIndex=0;lineIndex<this.grids.length;lineIndex++){			
			for(int colIndex=0;colIndex<this.grids[lineIndex].length;colIndex++){
				
				Random rand = new Random();
				int rng = rand.nextInt((int) (Math.pow(this.grids.length,2)/2));
				int rnjesus = rand.nextInt(this.grids.length);
				int r3d3 = rand.nextInt(this.grids[lineIndex].length);
				
				Cards card1 = new Cards(rng);
				Cards card2= new Cards(rng);
				
				if(!this.grids[lineIndex][colIndex].equals(card1) || !this.grids[lineIndex][colIndex].equals(card2)){
					this.grids[rnjesus][r3d3]= card1;
					this.grids[r3d3][rnjesus]= card2;
				}
				else{
				    rnjesus = rand.nextInt(this.grids.length);
					r3d3 = rand.nextInt(this.grids[lineIndex].length);
				}
					
			}
	}
}	

}
