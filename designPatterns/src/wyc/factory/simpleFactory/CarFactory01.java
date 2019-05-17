package wyc.factory.simpleFactory;

/**
 * 最基本的工厂模式1
 * 
 * @author 王以诚
 */
public class CarFactory01 {
	public static Car createCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("比亚迪".equals(type)) {
			return new Byd();
		} else {
			return null;
		}
	}
}