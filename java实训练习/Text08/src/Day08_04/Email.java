package Day08_04;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("请输入Email:");
		String s = sr.nextLine();
		// 判断您输入的Email是否含有@
		if (s.contains("@") == true) {
			// @不是开头，只有一个@
			if (s.indexOf("@") != 0 && s.indexOf("@") == s.lastIndexOf("@")) {
				String ss = s.substring(s.indexOf("@"));
				if (ss.contains(".") == true) {
					if (ss.indexOf(".") != 1 && ss.endsWith(".") == false) {
						System.out.println("您输入的邮箱格式正确！");
					} else {
						System.out.println("您输入的邮箱格式不正确！");
					}
				}
			}
			System.out.println("您输入的邮箱格式不正确！");
		} else {
			System.out.println("您输入的邮箱格式正确！");
		}

	}

}
