package Day08_02;

public class ColorPrinter implements IPrinter2{
	public void print(String info){
		System.out.println("彩色打印开始");
		IPrinter2.super.print(info);
		System.out.println("彩色打印结束");
	}
}
