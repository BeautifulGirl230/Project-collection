package common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			public static String getStrDate(Date date){
		return sf.format(date);
	}

}
