package wyc.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list = new ArrayList<Observer>();

	public void registerObserver(Observer obs) {
		list.add(obs);
	}

	public void removeObserver(Observer obs) {
		list.add(obs);
	}

	/**
	 * 通知所有观察者更新状态
	 */
	public void notifyAllObserver() {
		for (Observer obs : list) {
			obs.update(this);
		}
	}
}
