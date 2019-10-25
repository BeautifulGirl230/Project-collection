package Day09_01随机数;

import java.util.Random;


public class Randpm01 {

	public static void main(String[] args) {
		Random random = new Random();
		//随机生成0~3的随机整数
		System.out.println(random.nextInt(3));
		//随机生成3~5的随机数
		System.out.println(Math.random()*(5-3)+3);
	}

}
