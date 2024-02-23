package Sukiri9_1.java;

public class Wizard {
	String name;
	int hp;
	//引数はHERO型
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}

}
