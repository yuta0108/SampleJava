package sukiri10practice;

public class PosisonMatango extends Matango {
	int posisonCount = 5;
	public PosisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if (posisonCount > 0) {
			System.out.println("さらに胞子をばらまいた!");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.posisonCount--;
		}
	}
}
