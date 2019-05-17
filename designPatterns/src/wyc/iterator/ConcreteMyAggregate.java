package wyc.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * 
 * @author 王以诚
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();

	public void addObject(Object obj) {
		this.list.add(obj);
	}

	public void removeObject(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public MyIterator createIterator() {
		return new ConcreteIterator();
	}

	/**
	 * 使用内部类定义迭代器，可以直接使用外部类的属性
	 * 
	 * @author 王以诚
	 */
	private class ConcreteIterator implements MyIterator {
		/**
		 * 定义游标，用于记录遍历时的位置
		 */
		private int cursor;

		public void first() {
			cursor = 0;
		}

		@Override
		public void previous() {
			if (cursor > 0) {
				cursor--;
			}
		}

		@Override
		public void next() {
			if (cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if (cursor < list.size() - 1) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public boolean isFirst() {
			return cursor == 0;
		}

		@Override
		public boolean isLast() {
			return cursor == list.size() - 1;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}

	}
}
