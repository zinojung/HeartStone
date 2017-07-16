package game.hero;

import javax.swing.plaf.synth.SynthSeparatorUI;

import game.Attackable;
import game.Hurtable;
import game.WithSpecialAbility;
import game.card.Card;

public class Hero implements Hurtable, WithSpecialAbility{
	protected String name;
	protected int hasMana;
	protected int life;
	
	public void useCard(Card card) {
		card.useThis();
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	// setter, getter
	public int getMana() {
		return this.hasMana;
	}
	
	public Hero setMana(int mana) {
		this.hasMana = mana;
		return this;
	}
	
	public int addMana(int mana) {
		return this.hasMana += mana;
	}
	
	public int minMana(int mana) {
		return this.hasMana -= mana;
	}

	@Override
	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public int getLife() {
		return this.life;
	}

	@Override
	public void addLife(int life) {
		this.life += life;
	}

	@Override
	public void minLife(int life) {
		this.life -= life;
	}

	@Override
	public void attacked(int damage) {
		this.life -= damage;
	}

	@Override
	public void ability() {
		
	}

	@Override
	public void ability(Hurtable hurtableThing) {
		
	}

	@Override
	public void ability(Attackable attackableThing) {
		
	}

	@Override
	public void die() {
		//game이 끝나는 메서드 추가.
		System.out.println(this.name + "은 경기에서 패배했습니다.");
	}
	
}
