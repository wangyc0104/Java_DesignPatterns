package wyc.flyWeight;

/**
 * 享元类（围棋）
 * 
 * @author 王以诚
 */
public interface ChessFlyWeight {
	void setColor(String c);

	String getColor();

	void display(Coordinate c);
}

class ConcreteCless implements ChessFlyWeight {

	private String color;

	public ConcreteCless(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色：" + color);
		System.out.println("棋子位置：" + c.getX() + "," + c.getY());
	}

}
