package Day08_02;

public class BlackPrinter implements IPrinter2{
	public void print(String info){
		System.out.println("�ڰ״�ӡ��ʼ");
		IPrinter2.super.print(info);
		System.out.println("�ڰ״�ӡ����");
	}
}
