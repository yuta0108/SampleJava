package Sukiri11;

public class Hero extends Character {
	Sword sword;
	
	public void attack(Matango m) {
		System.out.println(this.name + "は " + this.sword.name + "で" + "攻撃した！");
		System.out.println("敵に10のダメージを与えた！");
		m.hp -= 10;
	}
	public Hero(String name) {
		this.hp = 100;	//hpフィールドを１００で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}
	public Hero() {
		this( "ダミー");
	}

}
