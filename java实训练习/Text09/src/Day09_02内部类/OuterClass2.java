package Day09_02�ڲ���;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class OuterClass2 {
	
	public String publicFieldInner;
	protected String protectedFieldInner;
	String defaultFieldInner;
	private String privateFieldInner;
	int i = 0;
	
		//�ⲿ�෽��
		public void outerClassMethod(){
			InnerClass inner = new InnerClass();
			inner.defaultFieldInner = "�ҵ�����";
			inner.privateFieldInner = "�ҵ�����";
			inner.protectedFieldInner = "�ҵ�����";
			inner.publicFieldInner = "�ҵ�����";
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
				publicFieldInner = "�ҵ�����";
				protectedFieldInner = "�ҵ�����";
				defaultFieldInner = "�ҵ�����";
				privateFieldInner = "�ҵ�����";
				
			}
		}
}
