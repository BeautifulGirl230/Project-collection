package cn.zjj.ai;

public class Dey03_shuzuo {

	public static void main(String[] args) {
		//生明数组
		int[] arr;  //int arr[];
		//创建数组空间  定义数组长度
		arr = new int[16];
		
		arr[1] = 33;
		arr[5] = 66;
		arr[10] = 99;
		arr[15] = 1212;
		
		for(int i = 0; i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		for(int i :arr){
			System.out.print(i+" ");
		}
	}
}
