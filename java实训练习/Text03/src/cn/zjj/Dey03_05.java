package cn.zjj;

public class Dey03_05 {
	
	public void  sutOkhttp(){
		Dey03_04 er = new Dey03_04();
		er.sutDd();
	}
	public static void main(String[] args) {
		//����һ������
		Dey03_05 se = new Dey03_05();
		//����sutDey����
		String asd = "�ȿ�";
		se.sutDey(asd);
		se.sutRev();
	}
	public String sutDey(String sum){
		System.out.println(sum);
		for(int i=1;i<=50;i++){
			if(i%3==0 && i%4==1){
				System.out.print(i+" ");
			}
		}
		return sum;
	}
	public void sutRev(){
		Dey03_05 D = new Dey03_05();
		D.sutOkhttp();;
		
	}
}
