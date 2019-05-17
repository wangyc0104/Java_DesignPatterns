package wyc.bridge;

public class Client {
	public static void main(String[] args) {
		// 销售联想笔记本
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		// 销售神州平板电脑
		c = new Pad2(new Shenzhou());
		c.sale();
	}
}
