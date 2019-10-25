package cn.zjj;

public class Dey02_02 {

	public static void main(String[] args) {
		
		byte varByte = 127;  //127 ~ -128
		
		short varShort = 3999;
		
		int varInt = 6548556;
		
		long varLong = 99998768L;  //超出int类型的整数要加L
		
		char varChar = '中'; //只能放一个字符
		//String string ="字符串"  它不是一个类型
		
		//强制类型转换
		varByte =(byte) varShort;
		
		System.out.println(varByte);
	}
	
}
