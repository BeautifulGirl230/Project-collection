package Day08_02;

/**
 * ѧУ��
 * @author Snake
 *
 */
public class GemSchool2 implements Introduceable {
		//ѧУ����һ����ӡ��
	private IPrinter2 iprinter;
	
		public void setIPrinter(IPrinter2 iprinter){
			this.iprinter = iprinter;
		}
		
	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "������Э��ͬ�ǽ���";
	}
	
	//ʵ��Introduceable�ӿڵ�����󣬶����Դ������
	public void print(Introduceable info){
		iprinter.print(info.detail());
	}

}
