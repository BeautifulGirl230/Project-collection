package cn.db;

public class CharText implements PCI {

	@Override
	public void show() {
		System.out.println("��������");
	}

	@Override
	public void run() {
		System.out.println("��������");
		PCI.super.run();
	}
	
	@Override
	public void stop() {
		System.out.println("����ֹͣ");
	}

}
