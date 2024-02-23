package Sukiri9_1.java;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "氷の剣";
		s.damage = 10;
		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.sword = s;
		
		Hero h2 = new Hero();
		h2.name = "あさか";
		Wizard w = new Wizard();
		w.name = "すがわら";
		
		w.heal(h1); //みなとを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 110 -> 120）
		
		System.out.println(h1.hp);
		System.out.println(h2.hp);		
		System.out.println(w.hp);		
		System.out.println("現在の武器は" + h1.sword.name);
		h1.attack();
	}
	

}
