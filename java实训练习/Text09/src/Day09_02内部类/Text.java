package Day09_02内部类;

import Day09_02内部类.OuterClass2.InnerClass;

public class Text {
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		InnerClass inner = outer.new InnerClass();

		String str = inner.defaultFieldInner = "我的世界1";
		System.out.println(str);
	}
}
