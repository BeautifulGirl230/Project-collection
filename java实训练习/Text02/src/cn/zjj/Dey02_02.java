package cn.zjj;

public class Dey02_02 {

	public static void main(String[] args) {
		
		byte varByte = 127;  //127 ~ -128
		
		short varShort = 3999;
		
		int varInt = 6548556;
		
		long varLong = 99998768L;  //����int���͵�����Ҫ��L
		
		char varChar = '��'; //ֻ�ܷ�һ���ַ�
		//String string ="�ַ���"  ������һ������
		
		//ǿ������ת��
		varByte =(byte) varShort;
		
		System.out.println(varByte);
	}
	
}
