package Day08_02;

public class GemTeachaer2 implements Introduceable {
	Printer printer = new Printer();
	@Override
	public String detail() {
		// TODO Auto-generated method stub
		return "��ʦ��Ҫһ̨��ӡ��";
	}

	public void printer(Introduceable infw) {
		// TODO Auto-generated method stub
		printer.print2(infw.detail());
	}

}
