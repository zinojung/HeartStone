package game;

public interface Fightable {
	public void attack(Fightable enemy);
	public void attacked(int damage);
	public void setDamage(int damage);
	public int getDamage();
}
