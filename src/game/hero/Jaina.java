package game.hero;

import game.Fightable;

//getter, setter 남발하지 않기

public class Jaina extends Hero implements Fightable{

	public Jaina(String name, int life) {
		super(name, life);
	}

	private int damage;

	@Override
	public void ability(Fightable enemy) {
		attack(enemy);
	}

	@Override
	public void attack(Fightable enemy) {
		enemy.attacked(2);
		this.attacked(enemy.getDamage());
	}

	@Override
	public void attacked(int damage) {
		this.damage -= damage;
		System.out.println(this.name + "가 " + damage + "만큼 공격당했다! ");
	}


	@Override
	public int getDamage() { 
		return this.damage;
	}

	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}

}
