package ϰ��;

public class Dey04_Text01 {

	public static void main(String[] args) {

		int Score = 0; // ����һ������ ��ȡ�ܷ�
		int[] sum = new int[20]; // ����һ��һά����
		int[][] arr = new int[20][5];

		for (int i = 0; i < arr.length; i++) {
			Score = 0;	//  ��ʼ��
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (100 * Math.random());
				Score += arr[i][j];
				sum[i] = Score;
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("�ܷ�:" + sum[i] + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("���ſε�ƽ���ɼ�����:");
		int[] avg = new int[5];
		int theSum = 0;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < arr.length; i++) {
				theSum += arr[i][j];
			}
			avg[j] = theSum / 20;
			theSum = 0;
			System.out.print(avg[j] + " ");
		}
	}

}
