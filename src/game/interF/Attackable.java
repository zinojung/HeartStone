package game.interF;

public interface Attackable {
	public void setDamage(int damage);
	public int  getDamage();
	public void addDamage(int damege);
	public void minDamage(int damege);
	public void attack(Dieable enemy);
}
