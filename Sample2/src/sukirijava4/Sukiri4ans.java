package sukirijava4;

public class Sukiri4ans {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//p171 4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("当たり");
			}
		}

	}

}
