package sukiri12;
//Wizardクラスを通常の方法でインスタンス化
public class Main {

	public static void main(String[] args) {
		//どんな箱に入っているかは関係ない。その為中身のSlimeが実行される
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		Wizard w1 = new Wizard();
//		Wizard w2 = new Wizard();
//		//宿屋に泊まる
//		h1.hp += 100;
//		h2.hp += 100;
//		w1.hp += 100;
//		w2.hp += 100;
		
		Character[] c = new Character[4];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Wizard();
		c[3] = new Wizard();
		
		Monster[] m = new Monster[3];
		m[0] = new Slime();
		m[1] = new Slime();
		m[2] = new Matango();
		
		for (Monster mh : m) {
			mh.run();
		}
		
		for (Character ch : c) {
		//コレクション内の各要素 () を反復する for-each ループ
			ch.hp += 100;
		}
	}
}
