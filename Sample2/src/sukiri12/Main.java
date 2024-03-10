package sukiri12;
//Wizardクラスを通常の方法でインスタンス化
public class Main {

	public static void main(String[] args) {
		//どんな箱に入っているかは関係ない。その為中身のSlimeが実行される
		Monster m = new Slime();
		Slime s = new Slime();
		s.run(); m.run();
	}

}
