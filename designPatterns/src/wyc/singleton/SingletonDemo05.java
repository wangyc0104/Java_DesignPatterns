package wyc.singleton;

/**
 * 枚举法实现单例模式（避免了反射和反序列化的漏洞，没有延时加载效果）
 */
public enum SingletonDemo05 {

	/**
	 * 这个枚举元素本身就是SingletonDemo05中的一个单例对象
	 */
	INSTANCE;

	/**
	 * 添加自己需要的操作
	 */
	public void singletonOperation() {
		/** 这个可以写一些方法 **/
	}

}
