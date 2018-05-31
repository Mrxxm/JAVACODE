// 局部内部类
public class LocalInnerClassesThird {
	public static void main(String[] args) {
		int age = 15;
		// 内部类
		class Inner{
			String info = "Inner";
			void show(){
				System.out.println(age);
			}
		}
		// 1.
		System.out.println(new Inner().info);
		/**
		 * Inner
		 */
		// 2.访问局部变量一定是final修饰的常量，java8中隐式添加final
		Inner in = new Inner();
		in.show();
		/**
		 * 15
		 */
	}
}
