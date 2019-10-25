package cn.zjj;

public class Dey03_03 {

	public static void main(String[] args) {
		for(int i=9; i>=1; i--){
//			for (int k = 9; k > i; k--) {
//				System.out.print("\t");
//			}
			for(int j=1; j<=i; j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}

}
