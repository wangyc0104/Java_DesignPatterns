package wyc.factory.simpleFactory;

/**
 * 没有工厂模式时
 * 
 * @author 王以诚
 */
public class Client01 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		c1.run();
		c2.run();
	}
}
