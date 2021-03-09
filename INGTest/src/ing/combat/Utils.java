package ing.combat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

	public static int round = 1;
	public static Logger logger  = Logger.getLogger(CombatApp.class.getName()); 
	
	public static void PlayTheGame(Player player1, Player player2) {
		// TODO Auto-generated method stub

		round=1;
		
		while (!player1.getPlayingCards().isEmpty() && !player2.getPlayingCards().isEmpty()) {
			logger.log(Level.INFO, "Round="+round);
			  logger.log(Level.INFO, "Player 1's deck:"+player1.getPlayingCards()+"Point is "+player1.calculatePoint());
			  logger.log(Level.INFO, "Player 2's deck:"+player2.getPlayingCards()+"Point is "+player2.calculatePoint());
			  logger.log(Level.INFO, "Player 1's Plays:"+player1.getPlayingCards().peek());
			  logger.log(Level.INFO, "Player 2's Plays:"+player2.getPlayingCards().peek());
			  
			if (player1.getPlayingCards().peek() > player2.getPlayingCards().peek()) {
				
				player1.getPlayingCards().add(player1.getPlayingCards().peek());
				player1.getPlayingCards().poll();
				player1.getPlayingCards().add(player2.getPlayingCards().peek());
				player2.getPlayingCards().poll();
				logger.log(Level.INFO, "Player 1 Wins The Round");

			} else {

				player2.getPlayingCards().add(player2.getPlayingCards().peek());
				player2.getPlayingCards().poll();
				player2.getPlayingCards().add(player1.getPlayingCards().peek());
				player1.getPlayingCards().poll();
				logger.log(Level.INFO, "Player 2 Wins The Round");
			}
			
			round++;

		}
		
		  logger.log(Level.INFO, "=====================Final Result====================");
			
		  logger.log(Level.INFO, "player1"+player1.getPlayingCards()+"Point is "+player1.calculatePoint());
		  logger.log(Level.INFO, "player2"+player2.getPlayingCards()+"Point is "+player2.calculatePoint());


	}

}
