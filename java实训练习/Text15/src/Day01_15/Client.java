package Day01_15;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("请输入：");
		String string = sr.next();
		try {
			Socket socket = new Socket("192.168.1.145",8888);
			OutputStream out = socket.getOutputStream();
			BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(out));

			buff.write(string);
			buff.flush();
			buff.close();
			out.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}

}
