package wyc.factory.abstractFactory;

public class Client {

	public static void main(String[] args) {
		// 好车
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
		// 差车
	}
}
