package Day09_01�����;

import java.util.Random;


public class Randpm01 {

	public static void main(String[] args) {
		Random random = new Random();
		//�������0~3���������
		System.out.println(random.nextInt(3));
		//�������3~5�������
		System.out.println(Math.random()*(5-3)+3);
	}

}
