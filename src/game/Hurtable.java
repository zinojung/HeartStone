package game;

public interface Hurtable {
	public void setLife(int life);
	public int  getLife();
	public void addLife(int life);
	public void minLife(int life);
	public void attacked(int damage);
	public void die();
}
