package wyc.adapter;

/**
 * 适配器本身（相当于USB和PS/2的转接头）<br>
 * 继承Adaptee（类适配器方式，缺点是：单继承存在局限性） <br>
 * 
 * @author 王以诚
 */
public class Adapter01 extends Adaptee implements Target {

	@Override
	public void handleReq() {
		super.request();
	}

}
