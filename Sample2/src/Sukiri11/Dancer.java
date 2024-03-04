package Sukiri11;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った！");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に1のダメージを与えた！");
		m.hp -= 1;
	//親から継承した「詳細未定のattack()」を上書きする
	}
	public Dancer(String name) {
		this.name = name;
	}
}
