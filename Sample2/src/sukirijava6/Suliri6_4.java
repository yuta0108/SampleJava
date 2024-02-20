package sukirijava6;

public class Suliri6_4 {

	public static void main(String[] args) {
		int[] heights = {172, 187, 200, 152, 168};
		java.util.Arrays.sort(heights);
		//javaが備える並び替え命令
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
