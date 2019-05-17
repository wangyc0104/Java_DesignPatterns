package wyc.proxy.dynamicProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");

	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("歌手唱歌，全场燃起来了");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}
