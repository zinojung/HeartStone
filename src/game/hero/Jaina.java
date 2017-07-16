package game.hero;

import game.Hurtable;

//getter, setter 남발하지 않기

public class Jaina extends Hero {

	private int abilityDamage; 

	@Override
	public void ability(Hurtable enemy) {
		enemy.attacked(abilityDamage);
	}

}
