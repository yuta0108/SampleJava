package Sukiri11;
//処理内容を確定していないためimplementsではなくextendsを使う
public class Human extends Ceature {
	//抽象クラスとして追加
	void talk();
	void watch();
	void hear();
	//さらに親インターフェイスから継承する。
}
