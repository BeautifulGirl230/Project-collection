package Day10_01作业;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try{
			
		Scanner sr = new Scanner(System.in);
		while (true) {
		System.out.println("请输入整数：");
		int a = sr.nextInt();
		
		System.out.println(a/0);
		}
		
		//InputMismatchException:由 Scanner 抛出，表明获取的标记与期望类型的模式不匹配，或者该标记超出期望类型的范围。
		}catch (InputMismatchException e) {	 
			System.out.println("输入的数不能为小数点\n"+e);
		}catch (ArithmeticException e2) {	//ArithmeticException:算术错误情形，如以零作除数
			System.out.println("整数不可以除以0\n"+e2);
		}finally {
			System.out.println("finally:我已被执行");
		}
		
	}

}
