package Day10_01异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GemException4 {

	public static void main(String[] args) {
		try {
			Scanner sr = new Scanner(System.in);
			System.out.print("请输入S1的总学时：");
			int totalTime = sr.nextInt();
			System.out.print("请输入S1的课程数目：");
			int totalCourse = sr.nextInt();
			System.out.println("S1各课程的平均学时为：" + totalTime / totalCourse);
//InputMismatchException	由 Scanner 抛出，表明获取的标记与期望类型的模式不匹配，或者该标记超出期望类型的范围
		} catch (InputMismatchException e) {
			System.out.println("输入不为数字");
		} catch (ArithmeticException e2) {
			System.out.println("课程数目不能为零");
		} catch (Exception e) {
			System.out.println("发生错误：" + e.getMessage());
		}

	}
}
