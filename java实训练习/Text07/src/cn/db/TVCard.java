package cn.db;

public class TVCard implements PCI {

	@Override
	public void show() {
		System.out.println("����ת��������");
	}
	
	@Override
	public void run() {
		System.out.println("����ת��������");
		PCI.super.run();
	}
	
	@Override
	public void stop() {
		System.out.println("����ת����ֹͣ");
	}

}
