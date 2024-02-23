package wannderkuesuto2;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void salfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("MP-5を消費し、HPを最大回復した！");
	}
	public int play(int sec) {
		//何秒祈るか引数で受け取る
		System.out.println(this.name + "は" + sec + "秒間祈った！");
		//ランダムにする
		int recover = new Random().nextInt(3) + sec;
		//回復量を計算,recoverは前述のランダムな回復量,Math.minは、2つの値のうち小さい方を返す
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		//recoverActualを実際の回復量として、キャラクターのMPを更新
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
}

