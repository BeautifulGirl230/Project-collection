package cn.zjj;

public class Dey04_02 {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,7};
		int[] arrCopy = new int[2];
//      src - 源数组。
//	    srcPos - 源数组中的起始位置。
//	    dest - 目标数组。
//	    destPos - 目标数据中的起始位置。
//	    length - 要复制的数组元素的数量。
		System.arraycopy(arr, 1, arrCopy, 0, 2);
		System.out.println(arrCopy[0]);
		System.out.println(arrCopy[1]);
	}

}
