package wyc.decorator;

/**
 * 抽象构建
 * 
 * @author 王以诚
 */
public interface ICar {
	void move();
}

/**
 * 普通车
 * 
 * @author 王以诚
 */
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
}

/**
 * Decorator装饰角色
 * 
 * @author 王以诚
 */
abstract class SuperCar implements ICar {

	private ICar car;

	public SuperCar(ICar car) {
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}

/**
 * 具体装饰对象
 * 
 * @author 王以诚
 */
class FlyCar extends SuperCar {
	public FlyCar(ICar car) {
		super(car);
	}

	public void fly() {
		System.out.println("天上飞");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}

class SwimCar extends SuperCar {
	public SwimCar(ICar car) {
		super(car);
	}

	public void swim() {
		System.out.println("水中游");
	}

	@Override
	public void move() {
		super.move();
		swim();
	}
}

class AICar extends SuperCar {
	public AICar(ICar car) {
		super(car);
	}

	public void AI() {
		System.out.println("自动控制");
	}

	@Override
	public void move() {
		super.move();
		AI();
	}
}