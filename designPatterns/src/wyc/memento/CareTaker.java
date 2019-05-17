package wyc.memento;

/**
 * 负责人<br>
 * 负责管理备忘录对象<br>
 * 
 * @author 王以诚
 */
public class CareTaker {
	private EmpMemento memento;

	// 如果想要做很多个备忘点
	// private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
