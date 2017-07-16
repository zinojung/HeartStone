package game.card;

public class Card {
	protected String name;
	protected int mana;

	public void useThis() {
		
	}
	
	public void destoryCard() {
		//필드에서 카드 삭제.
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
