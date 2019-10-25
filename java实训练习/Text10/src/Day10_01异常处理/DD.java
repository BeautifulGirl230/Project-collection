package Day10_01异常处理;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		System.out.print("输入1~3:");
		Scanner sr = new Scanner(System.in);
		int cou = 0;
		try {
			cou = sr.nextInt();
		} catch (Exception e) {
			System.out.println("如果发生异常就执行这里");
			e.printStackTrace();	//打印异常的位置
		
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
			System.out.println("程序结束" + e2);
		}finally{
			System.out.println("无论发生的异常能否处理，这里的代码一定会执行，它一般用来完成资源释放");
		}
		}
	}

}
