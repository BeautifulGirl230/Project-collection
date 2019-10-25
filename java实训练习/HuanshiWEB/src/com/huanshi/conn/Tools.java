package com.huanshi.conn;

import java.text.SimpleDateFormat;

public class Tools {
	public static String dateChangetoString(java.util.Date date) {
		String strDate="";
		java.text.SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		strDate =format.format(date);
		return strDate;
	}
	public static java.util.Date StringToDate(String strdate) throws Exception{
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		
		return sdf.parse(strdate);
	}
}
