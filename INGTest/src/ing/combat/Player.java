package ing.combat;

import java.util.Queue;

public class Player {

	private String playerName;
	private Queue<Integer> playingCards;
	private int earnedPoints;
	private int multiplexer;
	

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Queue<Integer> getPlayingCards() {
		return playingCards;
	}

	public void setPlayingCards(Queue<Integer> playingCards) {
		this.playingCards = playingCards;
	}

	public int calculatePoint() {
		earnedPoints = 0;
		multiplexer = playingCards.size();

		if (multiplexer == 0) {
			return 0;
		} else {

			playingCards.forEach(kkk -> {

				earnedPoints += kkk * multiplexer;
				multiplexer--;
			});

		}
		return earnedPoints;
	}

}
