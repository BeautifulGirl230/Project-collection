package Day10_01�쳣����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		System.out.print("����1~3:");
		Scanner sr = new Scanner(System.in);
		int cou = 0;
		try {
			cou = sr.nextInt();
		} catch (Exception e) {
			System.out.println("��������쳣��ִ������");
			e.printStackTrace();	//��ӡ�쳣��λ��
		
		switch (cou) {
		case 1:
			System.out.println("AAA");
			break;
		case 2:
			System.out.println("BBB");
			break;
		case 3:
			System.out.println("CCC");
		}
		SimpleDateFormat sf = new SimpleDateFormat();
		String str = "2019-7-19";
		try {
			Date d = sf.parse(str);
		} catch (Exception e2) {
			System.out.println("�������" + e2);
		}finally{
			System.out.println("���۷������쳣�ܷ�������Ĵ���һ����ִ�У���һ�����������Դ�ͷ�");
		}
		}
	}

}
