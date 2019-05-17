package wyc.observer2;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String[] args) {
		/**
		 * 创建目标对象
		 */
		ConcreteSubject subject = new ConcreteSubject();

		/**
		 * 创建观察者
		 */
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		/**
		 * 将上面三个参赛者对象添加到目标对象subject的观察者容器中
		 */
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);

		/**
		 * 我们看看，观察者的初始状态
		 */
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());

		/**
		 * 更新状态
		 */
		subject.set(1000);

		/**
		 * 我们看看，观察者的状态是不是发生了变化
		 */
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
