package Day09_01��ʽ����������;

import java.text.NumberFormat;
import java.util.Locale;

public class TurNumberFormat {

	public static void main(String[] args) {
		NumberFormat numberformat1 =  NumberFormat.getInstance();
		numberformat1.setMaximumFractionDigits(3);	//����С����3λ
		NumberFormat numberformat2=  NumberFormat.getCurrencyInstance(Locale.US);	//Locale.US�ı�Ϊ��Ԫ����
		NumberFormat numberformat3=  NumberFormat.getPercentInstance();
		NumberFormat numberformat4=  NumberFormat.getNumberInstance();
		
		System.out.println(numberformat1.format(3.14123456));
		System.out.println(numberformat2.format(3.14));
		System.out.println(numberformat3.format(3.14));
		System.out.println(numberformat4.format(3.14123456789));
	}

}
