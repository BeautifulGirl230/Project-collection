package Day01_12;

import java.util.LinkedList;

public class Stack<R> {
	//LinkedList������ʵ�� Deque �ӿڣ�Ϊ add��poll �ṩ�Ƚ��ȳ����в������Լ�������ջ��˫�˶��в�����
	private LinkedList<R> link=new LinkedList<R>();
	public void add(R o){
		link.addLast(o);//addLast����ָ��Ԫ����ӵ����б�Ľ�β��
	}
	
	public R get(){
		R f = null;
		if(!this.link.isEmpty()){
		 f = this.link.getLast();//getLast�����ش��б�����һ��Ԫ�ء�
		 this.link.removeLast();//removeLast���Ƴ������ش��б�����һ��Ԫ�ء�
		}
		
		
		return f;
	}

}
