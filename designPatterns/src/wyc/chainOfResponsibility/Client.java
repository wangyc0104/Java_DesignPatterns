package wyc.chainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		// 创建责任链对象
		Leader director = new Director("张主任");
		Leader manager = new Manager("李经理");
		Leader viceGeneralManager = new ViceGeneralManager("钱副总");
		Leader generalManager = new GeneralManager("王总");
		// 组织责任链对象的关系
		director.setNextLeader(manager);
		manager.setNextLeader(viceGeneralManager);
		viceGeneralManager.setNextLeader(generalManager);
		// 开始请假操作
		LeaveRequest req1 = new LeaveRequest("Tom", 45, "回英国老家探亲");
		director.handleRequest(req1);
	}
}
