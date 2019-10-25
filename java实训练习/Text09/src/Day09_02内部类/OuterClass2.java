package Day09_02内部类;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class OuterClass2 {
	
	public String publicFieldInner;
	protected String protectedFieldInner;
	String defaultFieldInner;
	private String privateFieldInner;
	int i = 0;
	
		//外部类方法
		public void outerClassMethod(){
			InnerClass inner = new InnerClass();
			inner.defaultFieldInner = "我的世界";
			inner.privateFieldInner = "我的世界";
			inner.protectedFieldInner = "我的世界";
			inner.publicFieldInner = "我的世界";
		}
		
		public static void outerClassfMehtodStatic(){
			OuterClass2 outer = new OuterClass2();
			InnerClass inner = outer.new InnerClass();
			inner.innerClaassMethhod();
			
		}
		
		class InnerClass{
			public String publicFieldInner;
			protected String protectedFieldInner;
			String defaultFieldInner;
			private String privateFieldInner;
			int i = 0;
			
			public void innerClaassMethhod(){
				publicFieldInner = "我的世界";
				protectedFieldInner = "我的世界";
				defaultFieldInner = "我的世界";
				privateFieldInner = "我的世界";
				
			}
		}
}
