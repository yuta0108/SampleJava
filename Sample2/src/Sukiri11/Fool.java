package Sukiri11;

public class Fool extends Character implements Human {
	//Characterからhpやnameなどをフィールドに継承
	//Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	//さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
}
