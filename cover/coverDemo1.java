// 隐藏
/**
 * 
 * @author tom
 * 字段不存在覆盖
 * 静态方法也不存在覆盖
 */
public class coverDemo1 {
	public static void main(String[] args) {
		superClass clz = new subClass(); // 多态
		System.out.println(clz.name);    // 隐藏，根据编译类型确定；
		/**
		 * superClass
		 */
		clz.show(); 					 // 隐藏，根据编译类型
		/**
		 * superShow
		 */
		clz.doWork();				     // 覆盖
		/**
		 * subDoWork
		 */
		
	}
}

class superClass{
	public String name = "superClass";
	public void doWork(){
		System.out.println("superDoWork");
	}
	static public void show(){
		System.out.println("superShow");
	}
}

class subClass extends superClass{
	public String name = "subClass";
	public void doWork(){
		System.out.println("subDoWork");
	}
	static public void show(){
		System.out.println("subShow");
	}
}
