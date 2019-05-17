package wyc.memento;

/**
 * 备忘录类
 * 
 * @author 王以诚
 */
public class EmpMemento {
	private String ename;
	private int age;
	private double salary;

	public EmpMemento() {
	}

	public EmpMemento(Emp e) {
		this.ename = e.getEname();
		this.age = e.getAge();
		this.salary = e.getSalary();
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
