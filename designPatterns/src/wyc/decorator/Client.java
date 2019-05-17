package wyc.decorator;

public class Client {
	public static void main(String[] args) {
		System.out.println("--------最普通的小汽车--------");
		Car car = new Car();
		car.move();
		// 一般装饰抽象类不可实例化
//		System.out.println("--------一般装饰小汽车--------");
//		SuperCar superCar = new SuperCar(car);
//		superCar.move();
		System.out.println("--------增加功能天上飞--------");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		System.out.println("--------增加功能水中游--------");
		SwimCar swimFlyCar = new SwimCar(flyCar);
		swimFlyCar.move();
		System.out.println("--------同时增加两个功能：飞行、水中游--------");
		SwimCar waterCar = new SwimCar(new FlyCar(car));
		waterCar.move();
	}
}
