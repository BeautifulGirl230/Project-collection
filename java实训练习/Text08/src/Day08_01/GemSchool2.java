package Day08_01;

/**
 * ѧУ��
 * @author Snake
 *
 */
public class GemSchool2 implements Introduceable {
		//ѧУ����һ����ӡ��
	Printer printer = new Printer();
	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "ѧУ��һ����ӡ��";
	}
	
	//ʵ��Introduceable�ӿڵ�����󣬶����Դ������
	public void print(Introduceable info){
		printer.print(info.detail());
	}

}
