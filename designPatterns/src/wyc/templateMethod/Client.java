package wyc.templateMethod;

/**
 * 模板方法本质上就是多态
 * 
 * @author 王以诚
 */
public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm1 = new DrawMoney();
		btm1.process();

		BankTemplateMethod btm2 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要存钱！！！");
			}
		};
		btm2.process();

		BankTemplateMethod btm3 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要理财，我这里有2000万韩币！！！");
			}
		};
		btm3.process();
	}
}

class DrawMoney extends BankTemplateMethod {
	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
}
