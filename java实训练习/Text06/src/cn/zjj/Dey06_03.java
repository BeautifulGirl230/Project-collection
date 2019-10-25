package cn.zjj;

public class Dey06_03 extends Student{
	private String dizhi;
	public Dey06_03(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}


	public Dey06_03(String name, int age, String course, String dizhi) {
		super(name, age, course);
		this.dizhi = dizhi;
	}


	@Override
	public String toString() {
		return super.toString()+"Dey06_03 [dizhi=" + dizhi + "]";
	}






	
}
