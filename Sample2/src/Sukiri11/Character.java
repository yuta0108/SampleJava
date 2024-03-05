package Sukiri11;

public abstract class Character {
	//抽象クラスとしてCharacterを宣言
	String name;
	int hp;
	public abstract void run();
	public abstract void attack(Matango m);
		//attackメソッドの内容決めていないため一端空にする
		//必ずオーバーライドして使うこと！
		//abstract: 抽象的 抽象メソッド
		//内容がどうなるかまでは現時点では確定できないので
		//(メソッド内部の処理はここでは記載しません)という意味
}
