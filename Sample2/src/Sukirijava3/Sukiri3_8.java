package Sukirijava3;

public class Sukiri3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		weight == 60
//		(age1 + age2) *2 > 60
//		age % 2 == 1
//		name.eqals("湊")
		
		int isHungry = 1;
		String food = "ハンバーガー";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food  + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		 
		boolean tenki = false;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else  {
			System.out.println("映画を見に行きます");
			System.out.println("寝ます");
		} 
		
		System.out.print("[メニュー] 1：検索 2：登録 3：削除 4：変更 >");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1 -> {
				System.out.print("検索します");
			}
			case 2 -> {
				System.out.println("登録します");
			}
			case 3 -> {
				System.out.println("削除します");
			}
			case 4 -> {
				System.out.println("変更します");
			}
			
		}

	}

}
