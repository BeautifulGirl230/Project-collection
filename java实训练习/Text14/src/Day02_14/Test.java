package Day02_14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.goupiaoliang.pojo.Student;

public class Test {

	public static void main(String[] args) {
		try {
			// Class c= Class.forName("com.goupiaoliang.pojo.Student");
			Class c = Class.forName("com.goupiaoliang.pojo.Student");
			Class c1 = Student.class;
			Student stu1 = new Student();
			Class c2 = stu1.getClass();
			
			Field[] f = c.getDeclaredFields();
			System.out.println(f.length);
			
			for (Field field : f) {
				System.out.println(field.getName());
			}
			Constructor[] cons = c.getConstructors();
			System.out.println(cons.length);
			for (Constructor con : cons) {
				System.out.println(con);
			}
			Student stu = (Student) cons[1].newInstance();
			Method[] methods = c.getDeclaredMethods();
			
			System.out.println(methods.length);
			System.out.println(methods[0]);
			methods[0].setAccessible(true);
			String str = methods[0].invoke(stu,null).toString();
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
