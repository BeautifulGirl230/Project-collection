package Day08_02;

/**
 * 学校类
 * @author Snake
 *
 */
public class GemSchool2 implements Introduceable {
		//学校里有一个打印机
	private IPrinter2 iprinter;
	
		public void setIPrinter(IPrinter2 iprinter){
			this.iprinter = iprinter;
		}
		
	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "这里是协力同城教育";
	}
	
	//实现Introduceable接口的类对象，都可以传入进行
	public void print(Introduceable info){
		iprinter.print(info.detail());
	}

}
