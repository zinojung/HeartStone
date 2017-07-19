package game.card.minion;

import game.card.Card;

public class MurlocRaider extends MinionCard{

	public MinionCard getCard() {
		MinionCard murlockRaider = new MurlocRaider();
		murlockRaider.setName("멀록 약탈꾼");
		murlockRaider.setDamage(2);
		murlockRaider.setLife(1);
		murlockRaider.setMana(1);
		return  murlockRaider;
	}
}
