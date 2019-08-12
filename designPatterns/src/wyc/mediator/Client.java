package wyc.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		// 市场部
		Market market = new Market(m);
		// 开发部
		Development devp = new Development(m);
		// 财务部
		Financial f = new Financial(m);
		market.selfAction();
		market.outAction();
		devp.selfAction();
		devp.outAction();
		f.selfAction();
		f.outAction();
	}
}
