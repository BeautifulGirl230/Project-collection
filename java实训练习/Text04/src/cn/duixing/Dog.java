package cn.duixing;
/**
 * 一类事物封装到JAVA里面首先得写class，定义这个类，类名是什么可以自己取。
 * 这里把类名叫做Dog
 */
public class Dog {
	    /**
	     * 接下来就是写这个狗这个类的属性或者叫成员变量，
	     * 比如说狗这个类的毛的颜色，怎么定义这个属性呢，
	     * 首先得定义毛的一个类型,如使用int来定义毛的颜色类型
	     */
	    int furcolor; //定义属性：毛的颜色
	    String height= "黄色"; //定义属性：狗的高度
	    String weight; //定义属性：狗的体重
	    /**
	     * 狗的颜色，高度，体重这些属性定义完了，接下来要定义的就是方法了。
	     * 如写一个CatchMouse（）方法，捉老鼠的方法。
	     * CatchMouse这个方法里面有一个对象类型的参数，捉哪一只老鼠，这个对象参数是属于Mouse这个类的
	     * @param m
	     */
	    public void CatchMouse(Mouse m){
	            //在方法体内写捉老鼠这个过程，怎么捉，跑着捉，走着捉
	            System.out.println("我捉到老鼠了，汪汪！，老鼠要尖叫了！"+height);
	            /**
	             * 老鼠尖叫一声，表示被狗咬到了，咬到了能不叫吗，很自然而然地想到，
	             * 尖叫（scream()）这个方法是属于Mouse这个类里面的某一个方法。
	             * 老鼠自己调用它，让它自己尖叫。这就是面向对象的思维。
	             */
	            m.scream();
	    }
	    
	    public static void main(String[] args) {
	        Dog  d = new Dog();//首先用new关键字创建一只狗
	        Mouse m=new Mouse();//造出一只老鼠。
	        d.CatchMouse(m);//然后用这只狗去抓老鼠，让狗调用CatchMouse()方法去捉某只老鼠。
	    }
	}

