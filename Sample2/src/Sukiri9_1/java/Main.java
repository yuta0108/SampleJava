package Sukiri9_1.java;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "氷の剣";
		s.damage = 10;
		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.hp = 100;
		h1.sword = s;
		
		Hero h2 = new Hero();
		h2.name = "あさか";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "すがわら";
		w.hp = 80;
		
		w.heal(h1); //みなとを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 110 -> 120）
				
		System.out.println("現在の武器は" + h1.sword.name);
		h1.attack();
	}
	

}
