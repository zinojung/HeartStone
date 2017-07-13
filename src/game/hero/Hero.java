package game.hero;

public abstract class Hero {
	protected String name;
	protected int life;
	
	public abstract void ability();

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
