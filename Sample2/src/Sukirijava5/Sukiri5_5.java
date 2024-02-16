package Sukirijava5;
//引数や戻り値
public class Sukiri5_5 {
//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {
		//int[] 引数に配列型を指定
		for (int element : array) {
			System.out.print(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array); //配列を渡す

	}

}
