package sukiri12;

public class Hero extends Character {
	public void attack (Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5のダメージ！");
		m.hp -= 5;
	}
}
