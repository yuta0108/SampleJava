package sukirijava4;

public class Sukiri4practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		if (input == 3) {
			System.out.println("当たり");
		} else if (input == 4) {
			System.out.println("当たり");
		} else if (input == 9) {
			System.out.println("当たり");
		}
	}

}
