package game.card.weapon;

import game.card.Card;
import game.interF.Attackable;
import game.interF.Hurtable;

public class WeaponCard extends Card implements Attackable {
	private int life;
	private int damage;
	
	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public int getDamage() {
		return this.damage;
	}

	@Override
	public void addDamage(int damege) {
		this.damage += damage;
	}

	@Override
	public void minDamage(int damege) {
		this.damage -= damage;
	}

	@Override
	public void attack(Hurtable enemy) {
		enemy.attacked(this.damage);
	}
}
