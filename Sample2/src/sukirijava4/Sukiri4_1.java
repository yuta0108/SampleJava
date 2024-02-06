package sukirijava4;

public class Sukiri4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int eigo = 20;
		int kokugo = 30;
		int shakai = 40;
		int sugaku = 80;
		int kagaku = 99;
		int sum = eigo + kokugo + shakai + sugaku + kagaku;
		int avg = sum / 5;
		System.out.println("合計点は" + sum);
		System.out.println("平均点は" + avg);
		
		int[] scores = new int[5];
		int num = scores.length;
		System.out.println("要素の数" + num);

	}

}
