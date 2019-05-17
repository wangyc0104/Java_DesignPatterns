package wyc.builder;

/**
 * 宇宙飞船
 * 
 * @author 王以诚
 */
public class AirShip {
	/**
	 * 轨道舱
	 */
	private OrbitalModule orbitalModule;

	/**
	 * 发动机
	 */
	private Engine engine;

	/**
	 * 逃逸塔
	 */
	private EscapeTower escapeTower;

	public AirShip() {
	}

	public void launch() {
		System.out.println("飞船启动！");
		System.out.println(this.engine.getName() + "点火");
		System.out.println(this.orbitalModule.getName() + "对接");
		System.out.println(this.escapeTower.getName() + "释放");
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

}

class OrbitalModule {
	private String name;

	public OrbitalModule(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Engine {
	private String name;

	public Engine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class EscapeTower {
	private String name;

	public EscapeTower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}