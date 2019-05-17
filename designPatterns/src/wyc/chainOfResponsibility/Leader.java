package wyc.chainOfResponsibility;

/**
 * 抽象类（领导）
 * 
 * @author 王以诚
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader; // 责任链上的后继对象

	public Leader(String name) {
		super();
		this.name = name;
	}

	public Leader(String name, Leader nextLeader) {
		this.name = name;
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请求的核心业务方法
	 * 
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leader getNextLeader() {
		return nextLeader;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

}
