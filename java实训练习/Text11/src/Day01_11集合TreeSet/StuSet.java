package Day01_11����TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StuSet {
	
	public static void main(String[] args) {
		// TreeSet����֤ set �ĵ���˳�򣻲�����ʹ�� null Ԫ��
		//���ܷ���ͬԪ�أ���ͬԪ�ػᱻ����
			
	TreeSet<String> set = new TreeSet<String>();
		String a = "aaa";
		set.add(a);
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
//		set.add(null);
		System.out.println(set.size());
		System.out.println(set.size());
		
		
		
		
//		��һ�ֱ�����ʽ	
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
////		�ڶ��ֱ�����ʽ
//		for(String string : set){
//			System.out.println(string);
//		}
//		
	}
}
