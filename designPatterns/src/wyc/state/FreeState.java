package wyc.state;

/**
 * 空闲状态
 * 
 * @author 王以诚
 */
public class FreeState implements State {
	@Override
	public void handle() {
		System.out.println("房间空闲没人住！");
	}
}
