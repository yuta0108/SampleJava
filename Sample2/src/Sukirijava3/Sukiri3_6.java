package Sukirijava3;

public class Sukiri3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i);
		}
		System.out.println("");
		
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i);
		}

	}

}
