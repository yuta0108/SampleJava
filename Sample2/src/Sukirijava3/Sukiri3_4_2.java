package Sukirijava3;

public class Sukiri3_4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います。");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case  1, 2 -> {
				System.out.println("いいね！");
			}
			case  3 -> {
				System.out.println("普通です");
			}
			case  4, 5 -> {
				System.out.println("うーん…");
			}
		}

	}

}
