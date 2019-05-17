package wyc.prototype;

import java.util.Date;

/**
 * 1997年，英国的克隆羊（深复制），多莉
 * 
 * @author 王以诚
 */
public class Sheep02 implements Cloneable {
	private String sname;
	private Date birthday;

	public Sheep02() {
	}

	public Sheep02(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep02 s = (Sheep02) super.clone(); // 直接调用Object对象的clone()方法
		s.birthday = (Date) this.birthday.clone(); // 克隆属性对象
		return s;
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
