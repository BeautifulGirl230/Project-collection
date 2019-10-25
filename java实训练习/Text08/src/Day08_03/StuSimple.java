package Day08_03;

public class StuSimple {

	public static void main(String[] args) {
		Army a = new Army(3);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		a.attacAll();
		a.moveAll();
	}

}
