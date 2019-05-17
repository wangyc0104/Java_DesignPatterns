package wyc.proxy.dynamicProxy;

/**
 * 模拟动态生成的代理的简单结构示意（并不是说Proxy.newProxyInstance()方法得到的类就是这个样子）
 */
public class ProxyStar implements Star {

	StarHandler handler;

	@Override
	public void confer() {
		try {
			handler.invoke(this, this.getClass().getMethod("confer", new Class<?>[] {}), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void signContract() {
		try {
			handler.invoke(this, this.getClass().getMethod("signContract", new Class<?>[] {}), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bookTicket() {
		try {
			handler.invoke(this, this.getClass().getMethod("bookTicket", new Class<?>[] {}), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sing() {
		try {
			handler.invoke(this, this.getClass().getMethod("sing", new Class<?>[] {}), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void collectMoney() {
		try {
			handler.invoke(this, this.getClass().getMethod("collectMoney", new Class<?>[] {}), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
