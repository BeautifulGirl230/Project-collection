package Day10_01作业;


import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		Scanner sr = new Scanner(System.in);
		Scanner sr2 = new Scanner(System.in);
		
		System.out.println("~欢迎光临索迪动物园~");
		System.out.println("请输入动物的名称：Dog、Cat或者Frog；输入Exit退出！！");
//		try{
/*	hasNext():这是java的迭代器的用法。　　
 * 1.使用方法 iterator()要求容器返回一个 Iterator。第一次调用Iterator 的next()方法时，它返回序列的第一个元素。　　
 * 2.使用next()获得序列中的下一个元素。　　
 * 3.使用hasNext()检查序列中是否还有元素。　　
 * 4.使用remove()将上一次返回的元素从迭代器中移除。
 */			while (sr.hasNext()) {
//			while (true) {		// 无限循环	
//				int ii=sr.nextInt();
				String name = sr.next();		
				if (name.equals("Dog")) {
					dog.SayHello();
					System.out.println("请选择：1-给它拍一张艺术照   2-把它呼唤过来");
					String a = sr2.next();
					if (a.equals("1")) {
						dog.SayHello2();
					} else {
						dog.SayHello3();
					}
				} else if (name.equals("Cat")) {
					cat.SayHello();
					System.out.println("请选择：1-给它拍一张艺术照   2-把它呼唤过来");
					String a = sr2.next();
					if (a.equals("1")) {
						cat.SayHello2();
					} else {
						cat.SayHello3();
					}
				} else if (name.equals("Frog")) {
					frog.SayHello();
					System.out.println("请选择：1-给它拍一张艺术照   2-把它呼唤过来");
					String a = sr2.next();
					if (a.equals("1")) {
						frog.SayHello2();
					} else {
						frog.SayHello3();
					}
				} else if (name.equals("Exit")) {
					System.out.println("您已退出！！！");
					break;
//				}
				} else {
					System.out.print("输入有误");
				}
				System.out.println("请输入动物的名称：Dog、Cat或者Frog；输入Exit退出！！");
				}	//while括号
			
//				}catch (Exception e) {
//						e.printStackTrace();
//						System.out.println("您的输入只能是数字，不能是字母");
//				}	
	}	//mian括號
}		//類括號
