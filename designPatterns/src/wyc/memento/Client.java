package wyc.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("大诚", 25, 1000);
		System.out.println("第一次打印对象:" + emp.getEname() + "-" + emp.getAge() + "-" + emp.getSalary());
		taker.setMemento(emp.memento()); // 备忘一次
		emp.setAge(35);
		emp.setEname("老诚");
		emp.setSalary(10000);
		System.out.println("第二次打印对象:" + emp.getEname() + "-" + emp.getAge() + "-" + emp.getSalary());
		emp.recovery(taker.getMemento());
		System.out.println("第三次打印对象:" + emp.getEname() + "-" + emp.getAge() + "-" + emp.getSalary());
	}
}
