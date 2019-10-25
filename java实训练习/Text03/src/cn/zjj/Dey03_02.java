package cn.zjj;

public class Dey03_02 {

	public static void main(String[] args) {
		for(int i = 1; i<=9; i++){
			for(int k = 1; k < i; k++){
				System.out.print("\t");
			}
			for(int j = i; j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
