package Day08_02;

public class Text {

	public static void main(String[] args) {
		
		GemSchool2 school2 = new GemSchool2();
		//school2.print(school2);
		
		BlackPrinter black = new BlackPrinter();
		school2.setIPrinter(black);
		
		GemTeachaer2 teachaer =new GemTeachaer2();
		 teachaer.printer(teachaer);
		 school2.print(teachaer);
		 
		 ColorPrinter color = new ColorPrinter();
		 school2.setIPrinter(color);
		 
		 Student student = new Student();
		 school2.print(student);
	}

}
