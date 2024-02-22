package wannderkuesuto;

public class Main {

	public static void main(String[] args) {
		//1.勇者生成
		Hero h = new Hero();
		//2.フィールドに初期設定をセット
		h.name = "みなと";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 38;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 40;
		m2.suffix = 'B';
		
		System.out.println("勇者" + h.name + "が誕生した！");
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
