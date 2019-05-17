package wyc.prototype;

import java.io.IOException;

/**
 * 测试原型模式的深克隆（序列化和反序列化的方式把浅复制对象实现深复制效果）<br>
 * 如果需要短时间创建大量对象，并且new对象耗时太长，则可以考虑使用原型模式<br>
 * 
 * @author 王以诚
 */
public class Client04 {

	public static void testNew(int size) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			@SuppressWarnings("unused")
			Laptop t = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new的方式创建耗时：" + (end - start));
	}

	public static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();
		for (int i = 0; i < size; i++) {
			@SuppressWarnings("unused")
			Laptop temp = (Laptop) t.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("克隆的方式创建耗时：" + (end - start));
	}

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		testNew(200);
		testClone(200);
	}
}

class Laptop implements Cloneable {
	/**
	 * 模拟一个很耗时的对象创建过程
	 */
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}