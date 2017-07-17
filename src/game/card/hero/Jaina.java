package game.hero;

import game.Hurtable;

//getter, setter 남발하지 않기

public class Jaina extends Hero {

	final private int MAGIC_POWER = 1; 

	@Override
	public void ability(Hurtable enemy) {
		System.out.println("제이나가 화염 작렬을 시전했습니다.");
		enemy.attacked(MAGIC_POWER);
	}

}
