package Day01_11����Set�ӿ�;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StuSet {
	//set �����һ��nullԪ��
	//���ܷ�����Ԫ�أ���ͬԪ�ػᱻ����
	//���������Ԫ��e1��e2����e1.equals(e2)=false
	// hashset������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣��������ʹ�� null Ԫ��
	
	public static void main(String[] args) {
		
	Set<String> set = new HashSet<String>();
	
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add(null);
//		��һ�ֱ�����ʽ	
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
//		�ڶ��ֱ�����ʽ
		for(String string : set){
			System.out.println(string);
		}
		
	}
}
