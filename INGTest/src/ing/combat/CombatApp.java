package ing.combat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class CombatApp {
	public static int round = 1;
	public static Logger logger  = Logger.getLogger(CombatApp.class.getName()); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player player1 = new Player();
		player1.setPlayerName("Player 1");
		Queue<Integer> ll = new LinkedList<Integer>();
		ll.add(9);
		ll.add(2);
		ll.add(6);
		ll.add(3);
		ll.add(1);
		player1.setPlayingCards(ll);
		
		
		Player player2 = new Player();
		player2.setPlayerName("Player 2");
		Queue<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(5);
		ll2.add(8);
		ll2.add(4);
		ll2.add(7);
		ll2.add(10);

		player2.setPlayingCards(ll2);


		Utils.PlayTheGame(player1,player2);


	}
}
