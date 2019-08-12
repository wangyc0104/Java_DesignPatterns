package wyc.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂<br>
 * 
 * @author 王以诚
 */
public class ChessFlyWeightFactory {

	/**
	 * 享元池（池就是容器）
	 */
	private static Map<String, ChessFlyWeight> map = new HashMap<>();

	/**
	 * 获得享元对象
	 */
	public static ChessFlyWeight getChess(String color) {
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return map.get(color);
		}
	}
}
