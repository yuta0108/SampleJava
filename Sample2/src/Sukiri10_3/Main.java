package Sukiri10_3;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		//Javaでは、すべてのコンストラクタは、先頭で必ず内部インスタンス(親クラス)の
		//コンストラクタを呼び出さなければならない
		Weapon w = new Weapon();
	}

}
