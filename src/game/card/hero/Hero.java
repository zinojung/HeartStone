package game.card.hero;

import game.card.Card;
import game.interF.Attackable;
import game.interF.HasGrade;
import game.interF.Hurtable;
import game.interF.WithSpecialAbility;

public class Hero extends Card implements Hurtable, WithSpecialAbility, HasGrade{
	protected int life;
	protected String grade;

	@Override
	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public int getLife() {
		return this.life;
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

	@Override
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String getGrade() {
		return this.grade;
	}

	@Override
	public void heal(int heal) {
		this.life += heal;
	}
	
}
