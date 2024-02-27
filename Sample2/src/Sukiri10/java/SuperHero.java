package Sukiri10.java;

public class SuperHero extends Hero {
//extends Hero: 「基本的にHeroと同じ」と宣言
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name  + "は撤退した！");
	}
	public void attack(Matango m) {
		super.attack(m);
		//親インスタンス部分のattack()を呼び出す
		if (this.flying) {
			super.attack(m);
			//親インスタンス部分のattack()を呼び出す
		}
	}
}
