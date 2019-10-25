package cn.zjj.ai;

public class Dey03_07 {

	public static void main(String[] args) {
		Dey03_06 D = new Dey03_06();
		int chararr[] = {1,2};
		int x = 1; int y = 2;
		
		D.sutD(chararr);
		D.sutH(x,y);
		
		System.out.println(chararr[0]);
		System.out.println(chararr[1]);
		System.out.println("x="+x+":y="+y);
	}

}
