package game.play;

import game.card.hero.Hero;
import game.card.hero.Jaina;
import game.card.minion.MinionCard;
import game.card.minion.MurlocRaider;

public class Match {
	final public static int INIT_LIFE = 30;
	final public static int INIT_MANA = 1;

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		
		//player1 세팅
		player1.setName("진호");
		Hero jaina = new Jaina();
		player1.setHero(jaina.getHero());
		MinionCard murlockRaider = new MurlocRaider();
		player1.putCardIntoDeck(murlocRaider.);
		
		//player2 세팅
		player2.setName("하나");
		player2.setHero(hero);
		player2.setName(name);
		
		//게임 플레이
		while(1) {
			
		}
	}

}
