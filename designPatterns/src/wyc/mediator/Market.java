package wyc.mediator;

/**
 * 市场部
 * 
 * @author 王以诚
 */
public class Market implements Department {
	private Mediator m;

	public Market(Mediator m) {
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("市场部：跑去接项目！");
	}

	@Override
	public void outAction() {
		System.out.println("市场部：汇报工作！项目承接的进度，需要资金支持！");
		m.command("financial");
	}
}
