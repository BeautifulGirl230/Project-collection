package Day09_01格式化处理数字;

import java.text.NumberFormat;
import java.util.Locale;

public class TurNumberFormat {

	public static void main(String[] args) {
		NumberFormat numberformat1 =  NumberFormat.getInstance();
		numberformat1.setMaximumFractionDigits(3);	//保留小数点3位
		NumberFormat numberformat2=  NumberFormat.getCurrencyInstance(Locale.US);	//Locale.US改变为美元符号
		NumberFormat numberformat3=  NumberFormat.getPercentInstance();
		NumberFormat numberformat4=  NumberFormat.getNumberInstance();
		
		System.out.println(numberformat1.format(3.14123456));
		System.out.println(numberformat2.format(3.14));
		System.out.println(numberformat3.format(3.14));
		System.out.println(numberformat4.format(3.14123456789));
	}

}
