package sukirijava4;

public class Sukiri4_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] [] scores = new int[2] [3];
		//2行3列の配列　	p167 4-18
		scores[0] [0] = 40;
		scores[0] [1] = 50;
		scores[0] [2] = 60;
		scores[1] [0] = 70;
		scores[1] [1] = 80;
		scores[1] [2] = 90;
		System.out.println(scores[1] [1]);
		
		int [] [] score = {{40, 50, 60}, {60, 70, 80}};
		//2次元配列初期化
		System.out.println(score.length);
		//2が出力される
		System.out.println(score[0].length);
		//3が出力される
	}

}
