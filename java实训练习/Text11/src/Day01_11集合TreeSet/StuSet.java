package Day01_11集合TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StuSet {
	
	public static void main(String[] args) {
		// TreeSet它保证 set 的迭代顺序；不允许使用 null 元素
		//不能放相同元素，相同元素会被覆盖
			
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
		
		
		
		
//		第一种遍历方式	
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
////		第二种遍历方式
//		for(String string : set){
//			System.out.println(string);
//		}
//		
	}
}
