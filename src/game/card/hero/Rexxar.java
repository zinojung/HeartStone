package game.hero;

import game.Hurtable;

public class Rexxar extends Hero{
	
	final private int MAGIC_POWER = 2;
	
	@Override
	public void ability (Hurtable hero) {
		if(!(hero instanceof Hero)) {
			System.out.println("렉사르는 영웅만 공격할 수 있습니다.");
			return;
		}
		System.out.println("렉사르가 상대 영웅에게 고정 사격을 시전했습니다.");
		hero.attacked(MAGIC_POWER);
	}
}
