package Day09_01������;

import java.util.Calendar;

public class Calendar02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"��");
		System.out.print(c.get(1)+"��");
		System.out.print(c.get(Calendar.MONTH)+1+"��");
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��");
	}
}
