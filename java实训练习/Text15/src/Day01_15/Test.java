package Day01_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://news.sina.com.cn/w/2019-07-24/doc-ihytcerm5973095.shtml?cre=tianyi&mod=pchp&loc=3&r=0&rfunc=63&tj=none&tr=12");
			URLConnection u = url.openConnection();
			InputStream input = u.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			String s = null;
			while(true){
				s = in.readLine();
				if(s == null)break;
				System.out.println(s);
			}
			in.close();
			u.connect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
