package cn.zjj;

public class Dey04_01 {

	public static void main(String[] args) {
		//定义一个二维数组   多维数组
		int[][] arr =new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//增强的for循环
  		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//数组的数组
		int [][] arrChar = new int[3][];
		int[] arr1 = new int[]{1,2,3};
		int[] arr2 = new int[]{4,5,6,7,8,9};
		int[] arr3 = new int[]{9,8,7,6};
		arrChar[0] = arr1;
		arrChar[1] = arr2;
		arrChar[2] = arr3;
		for (int i = 0; i < arrChar.length; i++) {
			for (int j = 0; j < arrChar[i].length; j++) {
				System.out.print(arrChar[i][j]+" ");
			}
			System.out.println();
		}
		//增强的for循环
		for (int[] is : arrChar) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
