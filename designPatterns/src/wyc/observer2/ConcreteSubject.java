package wyc.observer2;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ConcreteSubject extends Observable {
	private int state;

	public void set(int state) {
		this.state = state;
		setChanged(); // 表示目标对象已做了更改
		notifyObservers(state); // 通知所有的观察者
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
