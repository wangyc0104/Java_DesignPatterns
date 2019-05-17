package wyc.prototype;

import java.util.Date;

/**
 * 测试原型模式的浅克隆
 * 
 * @author 王以诚
 */
public class Client01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(1000000000000L);
		Sheep01 s1 = new Sheep01("少莉", date);

		/**
		 * s2是s1的浅克隆对象
		 */
		Sheep01 s2 = (Sheep01) s1.clone();
		s2.setSname("多莉");

		/**
		 * 这个Date对象是由s1和s2共同指向的一个日期对象
		 */
		date.setTime(System.currentTimeMillis());

		/**
		 * 可以看到s1和s2的date是相同的
		 */
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}
}
