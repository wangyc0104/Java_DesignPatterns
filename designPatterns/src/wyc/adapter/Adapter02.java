package wyc.adapter;

/**
 * 适配器本身（相当于USB和PS/2的转接头）<br>
 * 使用组合方式传入一个需要适配的对象（对象适配器方式，不存在单继承局限性，使用灵活） <br>
 * 
 * @author 王以诚
 */
public class Adapter02 implements Target {

	private Adaptee adaptee;

	@Override
	public void handleReq() {
		adaptee.request();
	}

	public Adapter02(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

}
