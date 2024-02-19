package Sukirijava5;

public class Sukiri5_3practice {

	public static void main(String[] args) {
		email();
	}
	public static void email() {
		String address = "minato@xxxxxx";
		String text = "今度飲みに行きましょ！";
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

}
