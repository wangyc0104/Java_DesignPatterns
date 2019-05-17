package wyc.strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打8折");
		return standardPrice * 0.8;
	}

}
