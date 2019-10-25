package Day01_13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) {
		File f = new File("old.txt");
		System.out.println(f.length());//查看字符长度
		try {
			f.createNewFile();//创建文件
			DataInputStream in = new DataInputStream(new FileInputStream(f));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("new.txt")));
			byte[] buf = new byte[1024];
			int i = in.read();
			while(i!=-1){
			i = in.read(buf);
			System.out.print((char)i);
			out.write(buf);
			}
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
