package Day10_01��ҵ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try{
			
		Scanner sr = new Scanner(System.in);
		while (true) {
		System.out.println("������������");
		int a = sr.nextInt();
		
		System.out.println(a/0);
		}
		
		//InputMismatchException:�� Scanner �׳���������ȡ�ı�����������͵�ģʽ��ƥ�䣬���߸ñ�ǳ����������͵ķ�Χ��
		}catch (InputMismatchException e) {	 
			System.out.println("�����������ΪС����\n"+e);
		}catch (ArithmeticException e2) {	//ArithmeticException:�����������Σ�������������
			System.out.println("���������Գ���0\n"+e2);
		}finally {
			System.out.println("finally:���ѱ�ִ��");
		}
		
	}

}
