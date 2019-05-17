package wyc.state;

/**
 * 已入住状态
 * 
 * @author 王以诚
 */
public class CheckedInState implements State {
	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}
}
