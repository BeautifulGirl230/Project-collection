package meishukeji.com.common;

import java.text.SimpleDateFormat;

public class Tools {

	public static String dateChanageString(java.util.Date date)
	{
		String strDate="";
		
		java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		strDate=sdf.format(date);
		return  strDate;
		
	}

	public static java.util.Date StringToDate(String  strdate) throws Exception
	{
		
		
		java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		return  sdf.parse(strdate);
	}
}
