package wyc.bridge;

/**
 * 品牌
 * 
 * @author 王以诚
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand {
	@Override
	public void sale() {
		System.out.print("销售联想");
	}
}

class Dell implements Brand {
	@Override
	public void sale() {
		System.out.print("销售戴尔");
	}
}

class Shenzhou implements Brand {
	@Override
	public void sale() {
		System.out.print("销售神州");
	}
}
