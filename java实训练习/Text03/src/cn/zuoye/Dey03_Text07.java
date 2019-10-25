package cn.zuoye;

public class Dey03_Text07 {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++){
			if(i%5==0 && i%6==0){
				System.out.println("同时能被5和6整除的数："+i);					
			}
		}
	}

}
