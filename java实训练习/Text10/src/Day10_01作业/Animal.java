package Day10_01��ҵ;


import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		Scanner sr = new Scanner(System.in);
		Scanner sr2 = new Scanner(System.in);
		
		System.out.println("~��ӭ�������϶���԰~");
		System.out.println("�����붯������ƣ�Dog��Cat����Frog������Exit�˳�����");
//		try{
/*	hasNext():����java�ĵ��������÷�������
 * 1.ʹ�÷��� iterator()Ҫ����������һ�� Iterator����һ�ε���Iterator ��next()����ʱ�����������еĵ�һ��Ԫ�ء�����
 * 2.ʹ��next()��������е���һ��Ԫ�ء�����
 * 3.ʹ��hasNext()����������Ƿ���Ԫ�ء�����
 * 4.ʹ��remove()����һ�η��ص�Ԫ�شӵ��������Ƴ���
 */			while (sr.hasNext()) {
//			while (true) {		// ����ѭ��	
//				int ii=sr.nextInt();
				String name = sr.next();		
				if (name.equals("Dog")) {
					dog.SayHello();
					System.out.println("��ѡ��1-������һ��������   2-������������");
					String a = sr2.next();
					if (a.equals("1")) {
						dog.SayHello2();
					} else {
						dog.SayHello3();
					}
				} else if (name.equals("Cat")) {
					cat.SayHello();
					System.out.println("��ѡ��1-������һ��������   2-������������");
					String a = sr2.next();
					if (a.equals("1")) {
						cat.SayHello2();
					} else {
						cat.SayHello3();
					}
				} else if (name.equals("Frog")) {
					frog.SayHello();
					System.out.println("��ѡ��1-������һ��������   2-������������");
					String a = sr2.next();
					if (a.equals("1")) {
						frog.SayHello2();
					} else {
						frog.SayHello3();
					}
				} else if (name.equals("Exit")) {
					System.out.println("�����˳�������");
					break;
//				}
				} else {
					System.out.print("��������");
				}
				System.out.println("�����붯������ƣ�Dog��Cat����Frog������Exit�˳�����");
				}	//while����
			
//				}catch (Exception e) {
//						e.printStackTrace();
//						System.out.println("��������ֻ�������֣���������ĸ");
//				}	
	}	//mian��̖
}		//���̖
