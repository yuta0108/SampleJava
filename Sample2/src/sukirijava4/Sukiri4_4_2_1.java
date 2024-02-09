package sukirijava4;

public class Sukiri4_4_2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] seq = new int[15];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		for (int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + "");
			// int baseType = seq[i];  i番目の数値を取得
			//char baseChar = base[baseType];　数値に対応する記号を取得
			//System.out.print(baseChar + " ");　記号を画面に表示
		}
		
		int[] scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			//value  価値
			System.out.println(value);
		}

	}

}
