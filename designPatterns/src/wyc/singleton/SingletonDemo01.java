package wyc.singleton;

/**
 * 测试饿汉式单例模式
 * 
 * @author 王以诚
 */
public class SingletonDemo01 {

	/**
	 * 类初始化时立即加载这个对象（没有延时加载的优势）<br>
	 * 由于加载类时，饿汉是预先建好，就这一次。所以是天然的线程安全的<br>
	 */
	private static SingletonDemo01 instance = new SingletonDemo01();

	/**
	 * 私有构造器
	 */
	private SingletonDemo01() {
	}

	/**
	 * 线程安全，不需要同步块，调用效率高
	 */
	public static SingletonDemo01 getInstance() {
		return instance;
	}

}
