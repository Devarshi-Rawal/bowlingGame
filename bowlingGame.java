package bowlingGame;
import java.util.*;
import bowlingGame.Bowling;

public class bowlingGame {

	public static void main(String[] args) {
		
		Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();

	}
}