package bowlingGame;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bowling {
	
	HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner()
    {
        int maxValueInMap=(Collections.max(players.values()));
        for (Map.Entry<String, Integer> score : players.entrySet())
        {
            if(score.getValue()==maxValueInMap)
            {
                System.out.println(score.getKey());
            }
        }  
    }

}
