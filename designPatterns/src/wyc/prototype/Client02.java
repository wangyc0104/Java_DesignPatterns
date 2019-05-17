package wyc.prototype;

import java.util.Date;

/**
 * 测试原型模式的深克隆
 * 
 * @author 王以诚
 */
public class Client02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(10000000000000L);
		Sheep02 s1 = new Sheep02("少莉", date);

		/**
		 * s2是s1的深克隆对象
		 */
		Sheep02 s2 = (Sheep02) s1.clone();
		s2.setSname("多莉");

		/**
		 * 这个Date对象是由s1指向的，而s2指向的Date是另一个对象
		 */
		date.setTime(System.currentTimeMillis());

		/**
		 * 可以看到s1和s2的date是不同的
		 */
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}
}
