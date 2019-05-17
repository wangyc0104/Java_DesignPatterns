package wyc.singleton;

/**
 * 测试静态内部类实现单例模式<br>
 * 这种方式：线程安全，调用效率高，并且实现了延时加载<br>
 * 
 * @author 王以诚
 */
public class SingletonDemo04 {
	private static class SingletonClassInstance {
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}

	private SingletonDemo04() {
	}

	public static SingletonDemo04 getInstance() {
		return SingletonClassInstance.instance;
	}
}
