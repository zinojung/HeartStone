package game.card.minion;

import game.card.Card;
import game.interF.Attackable;
import game.interF.Dieable;

public class MinionCard extends Card implements Attackable, Dieable{

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
		if(damage <= 0) { 
			this.dead(); 
		} 
		System.out.println(this.name + "의 남은 생명력 : " + this.life);
	}

	@Override
	public void attack(Dieable enemy) {
		enemy.attacked(damage);
		if(enemy instanceof MinionCard) {
			this.attacked(((MinionCard) enemy).getDamage());
		}
		System.out.println(this.name + "가 공격을 시도했습니다.");
	}
	

	@Override
	public void dead() {
		super.destoryCard();
		System.out.println(this.name + " 카드는 파괴되었습니다.");
	}

	@Override
	public void heal(int heal) {
		this.life += heal;
	}
	
	
}
