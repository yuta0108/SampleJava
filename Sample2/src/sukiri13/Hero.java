package sukiri13;

public class Hero {
	//他のクラスから直接変更できる必要がないためprivateを使用
	private int hp;
	private String name;
	Sword sword;
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	//attackはどのようなクラスからでも呼び出せるようにするためpublicを使用
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5のダメージ！");
		m.hp -= 5;
	}
	
	//privateによりdieメソッドは外部のメソッドから呼び出せない
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	//KingがHeroの名前を知るために追加
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
