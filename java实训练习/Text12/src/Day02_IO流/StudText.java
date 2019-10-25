package Day02_IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import common.DateUtil;

public class StudText {
	public static void main(String[] args) {
		File file = new File("F:/java实训/Text12/src/Day02_IO流/StudText.java/");//绝对路径
		File file2 = new File("info.txt");// 相对路径

		String fileName = "info2.txt";
		File file3 = new File(fileName);
		System.out.println("文件是否存在:" + file.exists());
		System.out.println("" + file2.getName());
		System.out.println("" + file2.getParent());
		System.out.println("" + file2.getPath());
		System.out.println("" + file2.getAbsolutePath());
		System.out.println("" + DateUtil.getStrDate(new Date(file2.lastModified())));
//		System.out.println("" + file2.length());
//		System.out.println("" + file2.canRead());
//		System.out.println("" + file2.delete());
		
		
		try {
			file2.createNewFile();// 创建文件
			FileInputStream in = new FileInputStream(file2);
			int i = 0;
			while (i != 0) {
				i = in.read();
				if (i == -1)
					break;
				System.out.print((char) i);
			}
			in.close();// 关闭流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(file2.isDirectory());
		String[] files = file.list();
		for (String string : files) {
			System.out.println(string);
		}
	}

}
