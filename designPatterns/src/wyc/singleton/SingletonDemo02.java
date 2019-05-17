package wyc.singleton;

public class SingletonDemo02 {

	/**
	 * 声明饿汉对象
	 */
	private static SingletonDemo02 sd2;

	/**
	 * 私有构造方法
	 */
	private SingletonDemo02() {
	}

	/**
	 * 当方法调用时才开始初始化对象或返回对象<br>
	 * 为了确保同步，加上synchronized<br>
	 */
	public static synchronized SingletonDemo02 getInstance() {
		if (sd2 == null) {
			sd2 = new SingletonDemo02();
		}
		return sd2;
	}
	
}
