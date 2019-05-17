package wyc.factory.simpleFactory;

/**
 * 最基本的工厂模式2
 * 
 * @author 王以诚
 */
public class CarFactory02 {
	public static Car createAudi() {
		return new Audi();
	}

	public static Car createByd() {
		return new Byd();
	}
}