package Sukiri9_1.java;

public class Wizard {
	String name;
	int hp;
	//引数はHERO型
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
	public Wizard() {
		this.hp = 80;	//hpフィールドを１００で初期化
	}

}
