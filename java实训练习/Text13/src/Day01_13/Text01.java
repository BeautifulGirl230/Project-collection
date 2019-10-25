package Day01_13;

import java.io.ByteArrayInputStream;
import java.io.IOException;



public class Text01 {
	public static void main(String[] args) {
		String str = "shijie_ninghao";
		byte[] b = str.getBytes();
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(b);
			int i = in.read();
			while(i != -1){
				 i = in.read();
				System.out.print((char)i);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
