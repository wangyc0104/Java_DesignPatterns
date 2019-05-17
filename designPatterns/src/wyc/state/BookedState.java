package wyc.state;

/**
 * 预订状态
 * 
 * @author 王以诚
 */
public class BookedState implements State {
	@Override
	public void handle() {
		System.out.println("房间已预订！不可再预订！");
	}
}
