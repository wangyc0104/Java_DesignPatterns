package wyc.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打85折");
		return standardPrice * 0.85;
	}

}
