package game.card.minion;

public class RiverCrocolisk extends MinionCard {
	
	public MinionCard getCard() {
		MinionCard riverCrocolisk = new MinionCard();
		riverCrocolisk.setName("민물악어");
		riverCrocolisk.setMana(2);
		riverCrocolisk.setLife(3);
		riverCrocolisk.setDamage(2);
		return riverCrocolisk;
	}
}
