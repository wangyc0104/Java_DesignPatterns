package wyc.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟杀毒软件
 * 
 * @author 王以诚
 */
public interface AbstractFile {
	/**
	 * 定义一个杀毒方法
	 */
	void killVirus();
}

/**
 * 图像查杀
 * 
 * @author 王以诚
 */
class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("图像文件：" + name + ", 进行查杀！");
	}
}

/**
 * 文本查杀
 * 
 * @author 王以诚
 */
class TextFile implements AbstractFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("文本文件：" + name + ", 进行查杀！");
	}
}

/**
 * 视频查杀
 * 
 * @author 王以诚
 */
class VideoFile implements AbstractFile {
	private String name;

	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("视频文件：" + name + ", 进行查杀！");
	}
}

class Folder implements AbstractFile {
	private String name;
	// 定义容器，用来存放本容器构建下的子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();

	public Folder() {
	}

	public Folder(String name) {
		this.name = name;
	}

	public Folder(List<AbstractFile> list) {
		this.list = list;
	}

	public Folder(String name, List<AbstractFile> list) {
		this.name = name;
		this.list = list;
	}

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("文件夹：" + name + ", 进行查杀！");
		for (AbstractFile file : list) {
			file.killVirus(); // 天然的递归
		}
	}

}