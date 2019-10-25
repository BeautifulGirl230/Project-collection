package Day02_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test01 {

	public static void main(String[] args) {
		try {
			File f = new File("F:/java实训/Text13/src/Day02_13/Test01.java");
			// InputStream input = new FileInputStream(f);//得到一个字节流 一次读8位
			// Reader inputChaneg = new
			// InputStreamReader(input);//完成将字节流转成字符流，一次读一个字符
			FileReader file = new FileReader(f);
			// Reader in = new BufferedReader(inputChaneg);//将输入字符流添加缓冲区
			Reader in = new BufferedReader(file);// 将输入字符流添加缓冲区

//			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("Test01.java"))));
			
			File outFile = new File("Test01.java"); // 文件位置
			// OutputStream output=new FileOutputStream(outFile); //得到一个字节流 一次写8位
			// Writer outChaneg=new OutputStreamWriter(output);
			//完成将字节流转成字符流，一次写一个字符
			FileWriter fwriter = new FileWriter("Test01.java");
			Writer out = new BufferedWriter(fwriter);// 将输出字符流添加缓冲区

			int i = in.read();

			while (i != -1) {
				i = in.read();
				System.out.print((char) i);
				out.write(i);
			}
			out.close();
			// input.close();
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
