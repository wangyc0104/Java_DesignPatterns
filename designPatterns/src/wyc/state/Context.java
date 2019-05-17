package wyc.state;

public class Context {

	/**
	 * 如果是银行系统，这个Context类就是账号。根据金额不同，切换不同的状态！<br>
	 * 废账户||白金账号||尊贵账号
	 */
	private State state;

	public void setState(State s) {
		System.out.println("修改状态！");
		state = s;
		state.handle();
	}
}
