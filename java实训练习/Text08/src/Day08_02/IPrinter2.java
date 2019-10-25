package Day08_02;

/**
 * 打印机类
 * 
 * @author Snake
 *
 */
public interface IPrinter2 {

	/**
	 * 打印机的打印方法
	 * 
	 * @param info
	 *            传入打印的信息
	 */
	public default void print(String info) {

		System.out.println(info);
	}

	public default void print2(String infw) {

		System.out.println(infw);
	}
}
