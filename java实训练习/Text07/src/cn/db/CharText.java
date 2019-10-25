package cn.db;

public class CharText implements PCI {

	@Override
	public void show() {
		System.out.println("Éù¿¨Æô¶¯");
	}

	@Override
	public void run() {
		System.out.println("Éù¿¨ÔËĞĞ");
		PCI.super.run();
	}
	
	@Override
	public void stop() {
		System.out.println("Éù¿¨Í£Ö¹");
	}

}
