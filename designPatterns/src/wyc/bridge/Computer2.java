package wyc.bridge;

public abstract class Computer2 {
	protected Brand brand;

	public Computer2(Brand brand) {
		this.brand = brand;
	}

	public void sale() {
		brand.sale();
	}
}

class Desktop2 extends Computer2 {
	public Desktop2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("台式机");
	}
}

class Laptop2 extends Computer2 {
	public Laptop2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("笔记本电脑");
	}
}

class Pad2 extends Computer2 {
	public Pad2(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("平板电脑");
	}
}