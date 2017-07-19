package game.hero;

import game.interF.Dieable;

//getter, setter 남발하지 않기

public class Jaina extends Hero {

	final private int MAGIC_POWER = 1; 

	@Override
	public void ability(Dieable enemy) {
		System.out.println("제이나가 화염 작렬을 시전했습니다.");
		enemy.attacked(MAGIC_POWER);
	}
	
	@Override
	public Hero getCard() {
		Hero jaina = new Jaina();
		jaina.setName("제이나");
		jaina.setMana(2);
		jaina.setLife(MAGIC_POWER);
		return jaina;
	}

}
