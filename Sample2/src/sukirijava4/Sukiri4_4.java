package sukirijava4;

public class Sukiri4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		//集計結果を入れるための変数を初期化して準備
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			//1科目ごとに変数sumに合算,右辺の値と左辺の変数の値を足し算し変数に代入
		}
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}

}
