package wyc.adapter;

/**
 * 客户端类 （相当于使用USB接口的笔记本）
 * 
 * @author 王以诚
 */
public class Client01 {
	public void test1(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		Client01 c = new Client01();
		Adaptee a = new Adaptee();
//		Target t = new Adapter01();
//		c.test1(t);
		Target t = new Adapter02(a);
		c.test1(t);
	}
}
