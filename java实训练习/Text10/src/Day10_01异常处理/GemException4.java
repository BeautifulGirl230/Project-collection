package Day10_01�쳣����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GemException4 {

	public static void main(String[] args) {
		try {
			Scanner sr = new Scanner(System.in);
			System.out.print("������S1����ѧʱ��");
			int totalTime = sr.nextInt();
			System.out.print("������S1�Ŀγ���Ŀ��");
			int totalCourse = sr.nextInt();
			System.out.println("S1���γ̵�ƽ��ѧʱΪ��" + totalTime / totalCourse);
//InputMismatchException	�� Scanner �׳���������ȡ�ı�����������͵�ģʽ��ƥ�䣬���߸ñ�ǳ����������͵ķ�Χ
		} catch (InputMismatchException e) {
			System.out.println("���벻Ϊ����");
		} catch (ArithmeticException e2) {
			System.out.println("�γ���Ŀ����Ϊ��");
		} catch (Exception e) {
			System.out.println("��������" + e.getMessage());
		}

	}
}
