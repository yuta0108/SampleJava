package comment;

public class Kouhan {

	public static void callDeae() {
		System.out.println("ええい！こしゃくな！くせ者だ！であえい！");
	}
	public static void 	showMondokoro() throws Exception {
		System.out.println("金さん、銀さん。もういいでしょう。");
		System.out.println("この紋所が目にはいらぬか！！");
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Zenhan.doTogame();
	}
}
