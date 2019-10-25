package Day08_01;

/**
 * 学校类
 * @author Snake
 *
 */
public class GemSchool2 implements Introduceable {
		//学校里有一个打印机
	Printer printer = new Printer();
	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "学校有一个打印机";
	}
	
	//实现Introduceable接口的类对象，都可以传入进行
	public void print(Introduceable info){
		printer.print(info.detail());
	}

}
