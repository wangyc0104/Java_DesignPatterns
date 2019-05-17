package wyc.strategy;

/**
 * 负责和具体的Strategy类交互<br>
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立地变化 <br>
 * 如果使用Spring的依赖注入功能，还可以通过配置文件，动态地注入不同的策略对象，动态地切换不同的算法<br>
 * 
 * @author 王以诚
 */
public class Context {
	/**
	 * 当前采用的算法
	 */
	private Strategy strategy;

	/**
	 * 可以通过构造器来注入
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 可以通过set/get来注入
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void printPrice(double s) {
		System.out.println("您该报价：" + strategy.getPrice(s));
	}

}
