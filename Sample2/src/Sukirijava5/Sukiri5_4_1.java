package Sukirijava5;
//オーバーロード
public class Sukiri5_4_1 {
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("10 + 20 = " + add(10, 20));
		System.out.println("30 + 40 + 30 = " + add(30, 40, 30));
		//JVMは引数の型と個数を比較し一致するほうのaddを呼び出す
	}

}
