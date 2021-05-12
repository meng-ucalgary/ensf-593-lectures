
/**
 * Code from Fig 3.16 on p.132
 * 
 * @author 
 *
 */
public class OneRowNim {
	
	private int nSticks = 7;
	private int player = 1;
	
	public OneRowNim() {

	}
	
	public OneRowNim(int sticks) {
		nSticks = sticks;
	}
	
	public OneRowNim(int sticks, int starter) {
		nSticks = sticks;
		player = starter;
	}
	
	public boolean takeSticks(int num) {
		if (num < 1) return false;
		else if(num > 3) return false;
		else {
			nSticks = nSticks -num;
			player = 3- player;
			return true;
		}
	}
	
	public int getSticks() {
		return nSticks;
		
	}
	
	public int getPlayer() {
		return player;
	}
	
	public boolean gameOver() {
		return (nSticks <= 0);
	}
	
	/**
	 * If you are the player that reduces sticks to 0 or lower,
	 * you loose.
	 * 
	 * @return
	 */
	public int getWinner() {
		if (nSticks < 1) return getPlayer(); // if(gameOver())
		else return 0;
	}
	
	public void report() {
		System.out.println("Number of sticks left: "+getSticks());
		System.out.println("Next turn by player: "+getPlayer());
	}
	
	

}
