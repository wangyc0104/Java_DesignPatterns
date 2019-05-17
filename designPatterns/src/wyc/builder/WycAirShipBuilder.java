package wyc.builder;

public class WycAirShipBuilder implements AirShipBuilder {// StringBuilder, JDomBuilder, SAaxBuilder...

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机！");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱！");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建逃逸塔！");
		return new EscapeTower("逃逸塔");
	}

}
