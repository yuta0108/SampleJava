package sukirijava;

public class Doko6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験：" + 
		   a + "と" + b + "とで大きいほうは・・・" + m );
		
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println
		    ("あなたは来年、" + ( n + 1) + "歳になります。");
		
		int r = new java.util.Random().nextInt(30);
		System.out.println("あれ？・・・あなたはたぶん、" + r + "歳ですね?");
		
		System.out.println("あなたの名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		//nexLineは文字列
		System.out.println("あなたの年齢はを入力してください。");
		int age2 = new java.util.Scanner(System.in).nextInt();
		//nexIntは数値
		System.out.println
		     ("ようこそ、" + age2 + "歳の" + name2 + "さん");
	}

}
