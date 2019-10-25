package Day08_03;

public class Army {
	private Weapon[] w = null;
	
	private int size = 0;
	
	private Army(){}
	
	Army(int i){
		w = new Weapon[i];
	}
	
	public void addWeapon(Weapon wa){
		if(size >= w.length){
			System.out.println("军队装备足够了！");
			//return;
		}else{
			w[size] = wa;
			size++;
		}
	}
	
	public void attacAll(){
		for(Weapon wea:w){
			if(wea !=null){
				wea.attack();
			}
		}
	}
	
	public void moveAll(){
		for(Weapon wea:w){
			if(wea != null){
				wea.move();
			}
		}
	}
}
