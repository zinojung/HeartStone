package game.card;

import game.Attackable;
import game.Hurtable;
import game.hero.Hero;

public class FightableCard extends Card implements Attackable, Hurtable {

	protected int life;
	protected int damage;
	
	@Override
	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public int getLife() {
		return this.life;
	}

	@Override
	public void addLife(int heal) {
		this.life += heal;
	}

	@Override
	public void minLife(int damage) {
		this.life -= damage;
	}


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
	public void attacked(int damage) {
		this.life -= damage;
		System.out.println(this.name + "가 공격당했습니다.");
		System.out.println(this.name + "의 남은 생명력 : " + this.life);
	}

	@Override
	public void attack(Hurtable enemy) {
		enemy.attacked(damage);
		if(enemy instanceof FightableCard) {
			this.life -= ((FightableCard) enemy).getDamage();
		}
		System.out.println(this.name + "가 공격을 시도했습니다.");
	}
	

	@Override
	public void die() {
		super.destoryCard();
		System.out.println(this.name + " 카드는 파괴되었습니다.");
	}
	

}
