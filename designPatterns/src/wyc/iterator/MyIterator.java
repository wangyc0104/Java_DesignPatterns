package wyc.iterator;

/**
 * 自定义迭代器
 * 
 * @author 王以诚
 */
public interface MyIterator {
	/**
	 * 将游标指向第一个元素
	 */
	void first();

	/**
	 * 将游标指向前一个元素
	 */
	void previous();

	/**
	 * 将游标指向下一个元素
	 */
	void next();

	/**
	 * 判断是否存在下一个元素
	 */
	boolean hasNext();

	/**
	 * 判断是否是第一个元素
	 */
	boolean isFirst();

	/**
	 * 判断是否是最后一个元素
	 */
	boolean isLast();

	/**
	 * 返回当前元素
	 */
	Object getCurrentObj();
}
