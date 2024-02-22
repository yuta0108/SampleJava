package wannderkuesuto;

public class Main {

	public static void main(String[] args) {
		//1.勇者生成
		Hero h = new Hero();
		//2.フィールドに初期設定をセット
		h.name = "みなと";
		h.hp = 100;
		System.out.println("勇者" + h.name + "が誕生した！");
		h.sit(5);
		h.slip();
		h.sit(10);
		h.run();
	}

}
