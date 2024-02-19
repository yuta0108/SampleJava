package Sukirijava5;

public class Sukiri5_4practice {
	public static double calcTriangleArea(double x, double y) {
		return x * y / 2;
	}
	public static double calcCircleArea(double x) {
		return x * x * 3.14;
	}

	public static void main(String[] args) {
		System.out.println(calcTriangleArea(10, 5));
		System.out.println(calcCircleArea(5));
	}
}
