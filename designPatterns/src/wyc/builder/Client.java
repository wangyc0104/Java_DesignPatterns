package wyc.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new WycAirShipDirector(new WycAirShipBuilder());
		AirShip as = director.directAirShip();
		as.launch();
	}
}
