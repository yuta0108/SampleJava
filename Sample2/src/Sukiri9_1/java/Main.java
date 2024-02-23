package Sukiri9_1.java;



public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "氷の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
	}
	

}
