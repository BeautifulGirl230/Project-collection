package Day09_02�ڲ���;

import Day09_02�ڲ���.OuterClass2.InnerClass;

public class Text {
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		InnerClass inner = outer.new InnerClass();

		String str = inner.defaultFieldInner = "�ҵ�����1";
		System.out.println(str);
	}
}
