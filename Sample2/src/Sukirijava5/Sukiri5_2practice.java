package Sukirijava5;

public class Sukiri5_2practice {
	public static void main(String[] args) {
		email();
	}
	public static void email() {
		String title = "ゲームのお誘い";
		String address = "minato@xxxxxxx";
		String text = "一緒にゲームしませんか？";
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
