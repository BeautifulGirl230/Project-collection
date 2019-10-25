package Day02_IO��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import common.DateUtil;

public class StudText {
	public static void main(String[] args) {
		File file = new File("F:/javaʵѵ/Text12/src/Day02_IO��/StudText.java/");//����·��
		File file2 = new File("info.txt");// ���·��

		String fileName = "info2.txt";
		File file3 = new File(fileName);
		System.out.println("�ļ��Ƿ����:" + file.exists());
		System.out.println("" + file2.getName());
		System.out.println("" + file2.getParent());
		System.out.println("" + file2.getPath());
		System.out.println("" + file2.getAbsolutePath());
		System.out.println("" + DateUtil.getStrDate(new Date(file2.lastModified())));
//		System.out.println("" + file2.length());
//		System.out.println("" + file2.canRead());
//		System.out.println("" + file2.delete());
		
		
		try {
			file2.createNewFile();// �����ļ�
			FileInputStream in = new FileInputStream(file2);
			int i = 0;
			while (i != 0) {
				i = in.read();
				if (i == -1)
					break;
				System.out.print((char) i);
			}
			in.close();// �ر���
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
