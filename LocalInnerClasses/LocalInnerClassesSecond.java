// 静态内部类
public class LocalInnerClassesSecond {
	public static void main(String[] args) {
		// 1.初始化
		Outter2.Inner in = new Outter2.Inner();
		// 2.访问外部类中静态成员与非静态成员
		in.IShow();
		/**
		 * 15
		 * 16
		 */
		// 3.内部类中的静态成员，在第三方类中可以使用各级类名直接引用
		System.out.println(Outter2.Inner.ageI1);
		/**
		 * 17
		 */
	}
}

class Outter2{
	static int ageO1 = 15;
	int ageO2 = 16;
	
	static class Inner{
		static int ageI1 = 17;
		int ageI2 = 18;
		
		void IShow(){
			System.out.println(ageO1);
			System.out.println(new Outter2().ageO2);
		}
	}
}