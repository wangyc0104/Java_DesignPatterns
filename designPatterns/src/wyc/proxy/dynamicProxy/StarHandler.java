package wyc.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * | 抽象角色中(接口)声明的所有方法都被转移到 <br>
 * | 调用处理器一个集中的方法中处理，这样，我们 <br>
 * | 可以更加灵活和统一的处理众多的方法。 <br>
 * @author Yicheng Wang
 */
public class StarHandler implements InvocationHandler {

	Star realStar;

	public StarHandler(Star realStar) {
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");
		if (method.getName().equals("sing")) {
			method.invoke(realStar, args);
		}
		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		return object;
	}

}
