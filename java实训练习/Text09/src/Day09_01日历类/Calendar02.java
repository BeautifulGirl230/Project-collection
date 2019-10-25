package Day09_01日历类;

import java.util.Calendar;

public class Calendar02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"年");
		System.out.print(c.get(1)+"年");
		System.out.print(c.get(Calendar.MONTH)+1+"月");
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");
	}
}
