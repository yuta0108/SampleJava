package Sukirijava3;

public class Sukiri3_4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int fortune = new java.util.Random().nextInt(5) + 1;
		String s = switch(fortune) {
		case 1 -> "大吉";
		case 2 -> "中吉";
		case 3 -> "吉";
		default -> "凶";
		};
		System.out.println("あなたの運勢は" + s);

	}

}
