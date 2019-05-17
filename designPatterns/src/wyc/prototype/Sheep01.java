package wyc.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 1997年，英国的克隆羊，多莉
 * 
 * @author 王以诚
 */
public class Sheep01 implements Cloneable, Serializable {
	private String sname;
	private Date birthday;

	public Sheep01() {
	}

	public Sheep01(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone(); // 直接调用Object对象的clone()方法
		return obj;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Sheep [sname=" + sname + ", birthday=" + birthday + "]";
	}

}
