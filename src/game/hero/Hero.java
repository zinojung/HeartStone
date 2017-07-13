package game.hero;

import game.Fightable;

public class Hero {
	protected String name;
	protected int life;

	public Hero (String name, int life) {
		this.name = name;
		this.life = life;
	}
	
	public void ability(){};
	public void ability(Fightable enemy){};

	public String getName() {
		return name;
	}

	public Hero setName(String name) {
		this.name = name;
		return this;
	}

	public int getLife() {
		return life;
	}

	public Hero setLife(int life) {
		this.life = life;
		return this;
	}
	
}
