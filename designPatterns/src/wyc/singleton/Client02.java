package wyc.singleton;

/**
 * 测试反射和反序列化破解单例模式 --> SingletonDemo06 <br>
 * 
 * @author 王以诚
 */
public class Client02 {
	public static void main(String[] args) throws Exception {

		// 普通调用单例模式
		SingletonDemo06 sd6 = SingletonDemo06.getInstance();
		System.out.println(sd6);

		// 通过反射调用私有构造方法
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("wyc.singleton.SingletonDemo06");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor();
//		c.setAccessible(true);
//		SingletonDemo06 s3 = c.newInstance();
//		SingletonDemo06 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);

		// 通过反序列化的方式构造多个对象
//		FileOutputStream fos = new FileOutputStream("F:/eclipse/testspace/a.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(sd6);
//		oos.close();
//		fos.close();
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/eclipse/testspace/a.txt"));
//		SingletonDemo06 s3 = (SingletonDemo06) ois.readObject();
//		System.out.println(s3);

	}
}
