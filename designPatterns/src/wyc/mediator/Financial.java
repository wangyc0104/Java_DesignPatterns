package wyc.mediator;

/**
 * 财务部
 * 
 * @author 王以诚
 */
public class Financial implements Department {
	private Mediator m;

	public Financial(Mediator m) {
		this.m = m;
		m.register("financial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("我在数钱！");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作！钱太多了，怎么花？");
	}
}
