package cn.zjj;

public class Dey04_02 {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,7};
		int[] arrCopy = new int[2];
//      src - Դ���顣
//	    srcPos - Դ�����е���ʼλ�á�
//	    dest - Ŀ�����顣
//	    destPos - Ŀ�������е���ʼλ�á�
//	    length - Ҫ���Ƶ�����Ԫ�ص�������
		System.arraycopy(arr, 1, arrCopy, 0, 2);
		System.out.println(arrCopy[0]);
		System.out.println(arrCopy[1]);
	}

}
