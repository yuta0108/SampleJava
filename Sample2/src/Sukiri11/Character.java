package Sukiri11;

public class Character {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	public void attack(Matango m) {
		//attackメソッドの内容決めていないため一端空にする
		//必ずオーバーライドして使うこと！
	}
}
