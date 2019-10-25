package Day08_02;

public class BlackPrinter implements IPrinter2{
	public void print(String info){
		System.out.println("黑白打印开始");
		IPrinter2.super.print(info);
		System.out.println("黑白打印结束");
	}
}
