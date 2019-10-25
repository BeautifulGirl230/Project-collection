package cn.zjj.db;

public class Dye02_Text04 {

	public static void main(String[] args) {
		int x = 30000;
		int sum = x;
		for(int i=0; i<10;i++){
			x *= 1.06;
			sum = sum + x;
		}
		System.out.println(x);
		System.out.println(sum);
	}
}
