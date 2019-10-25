package 习题;

public class Dey04_Text01 {

	public static void main(String[] args) {

		int Score = 0; // 定义一个变量 获取总分
		int[] sum = new int[20]; // 定义一个一维数组
		int[][] arr = new int[20][5];

		for (int i = 0; i < arr.length; i++) {
			Score = 0;	//  初始化
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (100 * Math.random());
				Score += arr[i][j];
				sum[i] = Score;
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("总分:" + sum[i] + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("五门课的平均成绩如下:");
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
