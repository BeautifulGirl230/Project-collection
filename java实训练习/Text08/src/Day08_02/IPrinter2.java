package Day08_02;

/**
 * ��ӡ����
 * 
 * @author Snake
 *
 */
public interface IPrinter2 {

	/**
	 * ��ӡ���Ĵ�ӡ����
	 * 
	 * @param info
	 *            �����ӡ����Ϣ
	 */
	public default void print(String info) {

		System.out.println(info);
	}

	public default void print2(String infw) {

		System.out.println(infw);
	}
}
