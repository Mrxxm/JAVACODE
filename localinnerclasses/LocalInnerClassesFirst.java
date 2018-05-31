// 实例内部类
public class LocalInnerClassesFirst {
	public static void main(String[] args) {
		// 1.初始化实例内部类
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		// 2.实例内部类可以直接访问外部类中成员
		in.IShow();
		/**
		 * Outter Classes
		 */
		// 3.外部类不能直接访问内部类成员,只能通过创建内部类对象来调用内部类成员
		out.OShow();
		/**
		 * Inner Classes
		 */
		// 4.实例内部类中不能定义静态成员
		
		// 5.访问内部类局部变量，内部类字段，外部类字段
		in.show();
		/**
		 * Inner
		 * Inne
	     * Inn
		 */
		
	}
}

// 外部类
class Outter{
	
	String strO = "Outter Classes";
	String name = "Inn";
	
	void OShow(){
		System.out.println(this.new Inner().strI);
	}
	// 内部类
	class Inner{
		
		String strI = "Inner Classes";
		//static int age = 13; // 实例内部类中不能定义静态成员
		String name = "Inne";
		
		void IShow(){
			System.out.println(strO);
		}
		
		void show(){
			String name = "Inner";
			
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
		
	}
}
