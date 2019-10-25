package cn.db;

public class TVCard implements PCI {

	@Override
	public void show() {
		System.out.println("电视转换卡启动");
	}
	
	@Override
	public void run() {
		System.out.println("电视转换卡运行");
		PCI.super.run();
	}
	
	@Override
	public void stop() {
		System.out.println("电视转换卡停止");
	}

}
