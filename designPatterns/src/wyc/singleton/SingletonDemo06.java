package wyc.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式（如何防止反射和反序列化漏洞）
 * 
 * @author 王以诚
 */
public class SingletonDemo06 implements Serializable {

	/**
	 * 声明懒汉对象
	 */
	private static SingletonDemo06 instance;

	/**
	 * 私有构造方法（添加条件抛出异常来防止反射调用）
	 * 
	 * @throws Exception
	 */
	private SingletonDemo06() {
		if (instance != null) {
			throw new RuntimeException("对象已存在，无需重复初始化");
		}
	}

	/**
	 * 当方法调用时才开始初始化对象或返回对象<br>
	 * 为了确保同步，加上synchronized<br>
	 * 
	 * @throws Exception
	 */
	public static synchronized SingletonDemo06 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo06();
		}
		return instance;
	}

	/**
	 * 反序列化时，如果定义了readResolve()方法 <br>
	 * 则直接返回此方法指定的对象而不需要返回反序列化的新对象 <br>
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}

}
