package Day01_14;

public class People {
	public void run(){
		System.out.println("run------------");
	}
	public void stu(){
		System.out.println("stu------------");
	}
	static class  Student extends People{
		public void run2(){
			System.out.println("run=============");
		}
		public void stu2(){
			System.out.println("stu==============");
		}
	}
}
