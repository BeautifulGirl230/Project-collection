package Day08_04;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("������Email:");
		String s = sr.nextLine();
		// �ж��������Email�Ƿ���@
		if (s.contains("@") == true) {
			// @���ǿ�ͷ��ֻ��һ��@
			if (s.indexOf("@") != 0 && s.indexOf("@") == s.lastIndexOf("@")) {
				String ss = s.substring(s.indexOf("@"));
				if (ss.contains(".") == true) {
					if (ss.indexOf(".") != 1 && ss.endsWith(".") == false) {
						System.out.println("������������ʽ��ȷ��");
					} else {
						System.out.println("������������ʽ����ȷ��");
					}
				}
			}
			System.out.println("������������ʽ����ȷ��");
		} else {
			System.out.println("������������ʽ��ȷ��");
		}

	}

}
