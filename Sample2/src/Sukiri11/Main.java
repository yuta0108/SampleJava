package Sukiri11;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "氷の剣";
		s.damage = 10;
		Hero h1 = new Hero("みなと");
		h1.sword = s;
		Hero h2 = new Hero("あさか");
		Wizard w = new Wizard("すがわら");
		Hero h3 = new Hero();
		Matango m = new Matango("お化けキノコ");
		m.suffix = 'A';
		
		
		w.heal(h1); //みなとを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 100 -> 110）
		w.heal(h2); //あさかを回復させる（hp: 110 -> 120）
		
		System.out.println(h1.name + "のHPは" + h1.hp + "です");
		System.out.println(h2.name + "のHPは" + h2.hp + "です");
		System.out.println(h3.name + "のHPは" + h3.hp + "です");	
		System.out.println(w.name + "のHPは" + w.hp + "です");
		System.out.println(h1.name + "の現在の武器は" + h1.sword.name);
		h1.attack(m);
		h1.run();
	}
}
