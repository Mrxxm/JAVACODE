// 模板方法设计模式 
public class TemplateMethod {
	public static void main(String[] args) {
		OperateString operate = new OperateString();
		OperateInt operateInt = new OperateInt();
		System.out.println(operate.getTotalTime()); // 100次的时间
		/**
		 * 5
		 */
		System.out.println(operateInt.getTotalTime()); // 100万次的时间
		/**
		 * 3
		 */
	}
}
// 操作的模板类
abstract class AbstractOperateTimeTemplate{
	// 模板方法，总体骨架，子类不能修改
	final public long getTotalTime(){
		long begin = System.currentTimeMillis(); // 开始时间
		
		// 具体操作，留给子类操作
		this.doWork();
		
		long end = System.currentTimeMillis(); // 结束时间
		long time = end - begin;
		return time;
	}
	// 留给子类的具体操作
	protected abstract void doWork();
}
// doWork的具体实现
class OperateString extends AbstractOperateTimeTemplate{
	protected void doWork(){
		String str = "";
		for(int i = 0; i < 1000; i++){
			str += i;
		}
	}
}
// doWork的另一种实现
class OperateInt extends AbstractOperateTimeTemplate{
	protected void doWork(){
		int sum = 0;
		for(int i = 0; i < 1000000; i++){
			sum += i;
		}
	}
}

