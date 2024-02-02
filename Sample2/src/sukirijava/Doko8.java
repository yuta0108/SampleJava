package sukirijava;

public class Doko8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 5;
		int y = 10;
		String ans = "x+yは"+( x + y);
		System.out.println(ans);
		
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("占いの結果が出ました！");
		int r = new java.util.Random().nextInt(4);
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + r + "です");
		System.out.println("(1：大吉　2：中吉　3：吉　4：凶)");

	}

}
