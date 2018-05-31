public class interfacedemo1 {
	public static void main(String[] args) {
		IWalk cat = new cat();
		cat.walk();
	}
}

// 接口
interface IWalk{
	void walk();
}

// 接口
interface ISwim{
	void swim();
}
// 接口继承接口使用关键字extends
interface Amphibiousable extends ISwim,IWalk{
	
}

class cat implements IWalk{
	// 接口中的方法都是公共抽象的，所以实现类必须覆盖，并且定义为public
	public void walk(){
		System.out.println("cat walk");
	}
}