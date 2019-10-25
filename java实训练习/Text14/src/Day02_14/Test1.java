package Day02_14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
	public static void main(String[] args) {
		try {
			String str = "shijieninhao";
			Method charat = Class.forName("java.lang.String").getMethod("charAt",int.class);
			
			String s = charat.invoke(str, 6).toString();
			System.out.println(s);
			
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
