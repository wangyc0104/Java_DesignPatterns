package wyc.iterator;

/**
 * 创建聚合对象
 * 
 * @author 王以诚
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aaaaaa");
		cma.addObject("bbbbbb");
		cma.addObject("cccccc");
		cma.addObject("dddddd");

		MyIterator iter = cma.createIterator();
		System.out.println("正序--------------------");
		while (iter.hasNext()) {
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
		System.out.println(iter.getCurrentObj());
		System.out.println("逆序--------------------");
		while (!iter.isFirst()) {
			System.out.println(iter.getCurrentObj());
			iter.previous();
		}
		System.out.println(iter.getCurrentObj());
	}
}
