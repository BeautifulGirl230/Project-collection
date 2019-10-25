package cn.zjj.ai;

public class Dey03_dayingzimu {
	
public static void main(String[] args) {
	Dey03_dayingzimu D = new Dey03_dayingzimu();
	char[]  c = D.createCharArray();
	//System.out.println(c);
	for(char i : c){
		System.out.print(i+" ");
	}
}
	public char[] createCharArray() {
		// 创建数组
		char[] arr = null;
		// 定义数组长度
		arr = new char[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('A' + i);
		}
		return arr;
	}
}
