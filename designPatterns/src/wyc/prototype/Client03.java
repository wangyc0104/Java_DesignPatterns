package wyc.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试原型模式的深克隆（序列化和反序列化的方式把浅复制对象实现深复制效果）
 * 
 * @author 王以诚
 */
public class Client03 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(10000000000000L);
		Sheep01 s1 = new Sheep01("少莉", date);
		System.out.println("修改之前 s1 ：" + s1);

		// 使用序列化和反序列化进行Sheep01的拷贝
		Sheep01 s2 = (Sheep01) deepCloneUsingSerializing(s1);
		System.out.println("修改之前 s2 ：" + s2);

		date.setTime(20000000000000L);
		System.out.println("修改之后 s1 ：" + s1);
		System.out.println("修改之后 s2 ：" + s2);

	}

	/**
	 * 使用对象输入输出嵌套字节输入输出流来实现序列化和反序列化
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deepCloneUsingSerializing(Object s1) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(s1);
		byte[] bytes = baos.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Sheep01 s2 = (Sheep01) ois.readObject();
		return s2;
	}
}
