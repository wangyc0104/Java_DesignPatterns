package wyc.singleton;

/**
 * 双重检测锁单例模式，由于CAS操作引发的问题，弃用
 * 
 * @author 王以诚
 * 
 */
public class SingletonDemo03 {
	private static SingletonDemo03 instance = null;

	public static SingletonDemo03 getInstance() {
		if (instance == null) {
			SingletonDemo03 sc;
			synchronized (SingletonDemo03.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDemo03.class) {
						if (sc == null) {
							sc = new SingletonDemo03();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}
