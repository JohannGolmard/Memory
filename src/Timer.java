/**
 * This class represents the timer of the Memory Game. The timer starts at 0 and finish when the game end.
 * @author golmardj
 *
 */
public class Timer
{
	/**
	 * The time of the game
	 */
	private int min,sec;
	
	/**
	 * Creates a new timer , initiate at 0
	 */
	public Timer(){
		this.min=0;
		this.sec=0;
	}

	/** Return the minute of the timer 
	 * @return min 
	 */
	public int getMin()
	{
		return this.min;
	}

	/** Change the value of min
	 * @param min
	 */
	public void setMin(int min)
	{
		this.min = min;
	}

	/**Return the second of the timer
	 * @return sec
	 */
	public int getSec()
	{
		return this.sec;
	}

	/** Change the value of sec
	 * @param sec
	 */
	public void setSec(int sec)
	{
		this.sec = sec;
	}
	
}
