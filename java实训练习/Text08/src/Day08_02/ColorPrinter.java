package Day08_02;

public class ColorPrinter implements IPrinter2{
	public void print(String info){
		System.out.println("��ɫ��ӡ��ʼ");
		IPrinter2.super.print(info);
		System.out.println("��ɫ��ӡ����");
	}
}
