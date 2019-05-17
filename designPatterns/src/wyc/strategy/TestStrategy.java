package wyc.strategy;

/**
 * 实现起来比较容易，符合一般开发人员的思路<br>
 * 假如类型特别多，算法比较复杂时，整个条件的语句代码就变得很长，难以维护<br>
 * 如果要新增类型，就需要频繁修改此处代码，不符合开闭原则<br>
 * 
 * @author 王以诚
 */
public class TestStrategy {
	public double getPrice(String type, double price) {
		if (type.equals("普通客户小批量")) {
			System.out.println("不打折,原价");
			return price;
		} else if (type.equals("普通客户大批量")) {
			System.out.println("打九折");
			return price * 0.9;
		} else if (type.equals("老客户小批量")) {
			System.out.println("打八五折");
			return price * 0.85;
		} else if (type.equals("老客户大批量")) {
			System.out.println("打八折");
			return price * 0.8;
		}
		return price;
	}
}
