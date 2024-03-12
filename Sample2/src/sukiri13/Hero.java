package sukiri13;

public class Hero {
	//他のクラスから直接変更できる必要がないためprivateを使用
	private int hp;
	String name;
	Sword sword;
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	//privateによりdieメソッドは外部のメソッドから呼び出せない
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
}
