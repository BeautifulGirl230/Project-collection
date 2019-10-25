package Day01_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(8888);
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			BufferedReader buff = new BufferedReader(new InputStreamReader(in));
			String s = null;
			while(true){
				s=buff.readLine();
				if(s==null)break;
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(server!=null){
				try {
					server.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	

}
