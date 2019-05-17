package wyc.singleton;

public class Client01 {
	public static void main(String[] args) {
		SingletonDemo04 s1 = SingletonDemo04.getInstance();
		SingletonDemo04 s2 = SingletonDemo04.getInstance();
		System.out.println(s1 + " -- " + s2);
		SingletonDemo05.INSTANCE.singletonOperation();
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
		System.out.println(SingletonDemo05.INSTANCE.hashCode());
	}
}
