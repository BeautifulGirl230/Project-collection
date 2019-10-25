package cn.zuoye;

public class Dey03_xiti01 {

	public static void main(String[] args) {
		int arr[] = {19789456,929,7645,415,57,849,7786,1567,967};
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1-i;j++){
				if(arr[j+1]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
		for(int x:arr)
		System.out.print(x+"\t");
	}

}
