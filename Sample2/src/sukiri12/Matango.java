package sukiri12;

public class Matango {
	String name;
	int hp;
		final int LEVEL = 5;
	char suffix;
	
	public Matango(String name) {
		this.name = name;
		this.hp = 40;
	}
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}
