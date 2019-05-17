package wyc.factory.simpleFactory;

/**
 * 简单工厂情况下测试
 * 
 * @author 王以诚
 */
public class Client02 {
	public static void main(String[] args) {
		Car c1 = CarFactory01.createCar("奥迪");
		Car c2 = CarFactory01.createCar("比亚迪");
		Car c3 = CarFactory02.createAudi();
		Car c4 = CarFactory02.createByd();
		c1.run();
		c2.run();
		c3.run();
		c4.run();
	}
}
