package wyc.builder;

public class WycAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public WycAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		/**
		 * 建造过程
		 */
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		AirShip ship = new AirShip();
		/**
		 * 组装过程
		 */
		ship.setEngine(e);
		System.out.println("组装了发动机");
		ship.setOrbitalModule(o);
		System.out.println("组装了轨道舱");
		ship.setEscapeTower(et);
		System.out.println("组装了逃逸塔");
		return ship;
	}

}
