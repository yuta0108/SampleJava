package wannderkuesuto;

public class Hero {
	String name;
	int hp;
	public void sleep() {
		this.hp = 100;
		//自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！");
		//this.name：自分自身のnameフィールド
	}
	public void sit(int sec) {
	//int sec: 何秒座るか引数で受け取る
		this.hp += sec;
		//座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
