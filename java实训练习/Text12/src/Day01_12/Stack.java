package Day01_12;

import java.util.LinkedList;

public class Stack<R> {
	//LinkedList：此类实现 Deque 接口，为 add、poll 提供先进先出队列操作，以及其他堆栈和双端队列操作。
	private LinkedList<R> link=new LinkedList<R>();
	public void add(R o){
		link.addLast(o);//addLast：将指定元素添加到此列表的结尾。
	}
	
	public R get(){
		R f = null;
		if(!this.link.isEmpty()){
		 f = this.link.getLast();//getLast：返回此列表的最后一个元素。
		 this.link.removeLast();//removeLast：移除并返回此列表的最后一个元素。
		}
		
		
		return f;
	}

}
