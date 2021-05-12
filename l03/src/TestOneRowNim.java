import java.util.Scanner;
/**
 * Code from Fig 3.17 p. 133
 * @author 
 *
 */
public class TestOneRowNim {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		OneRowNim game = new OneRowNim();
		
		while(game.gameOver() == false) { //while(!game.gameOver())
			game.report();
			
			System.out.println("Input 1, 2, or 3: ");
			
			int sticks = s.nextInt();
			game.takeSticks(sticks);
			System.out.println();
		}
		game.report();
		System.out.println("Game won by player ");
		System.out.println(game.getWinner());
	}

}
