package Day01_11集合Set接口;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StuSet {
	//set 最多有一个null元素
	//不能放相向元素，相同元素会被覆盖
	//任意的两个元素e1和e2都有e1.equals(e2)=false
	// hashset它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。此类允许使用 null 元素
	
	public static void main(String[] args) {
		
	Set<String> set = new HashSet<String>();
	
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add(null);
//		第一种遍历方式	
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
//		第二种遍历方式
		for(String string : set){
			System.out.println(string);
		}
		
	}
}
