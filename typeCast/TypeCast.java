public class TypeCast {
	public static void main(String[] args){
		// 大转小
		double PI = 3.1415;
		int pi = (int)PI;
		System.out.println(pi);
		
		// 大转小:典型例子
		/**
		 * byte b = 25;也是大转小，但是编译时，就能确定值在byte范围内；
		 * 而下一行代码在运行时，才能确定；
		 * 编译报错，b是byte类型，3是int类型；所以会报错：可能损失精度；
		 */
		byte b = 25;
		//b = b + 3; // 报错
		b = (byte)(b + 3);
		System.out.println(b);
		
		double a = 0.0 / 0.0;
		System.out.println(a == a); //NaN自己都不等于自己
		
		System.out.println(100 / 0.0); // 一个数除以一个无限小的数，值为无限大。
	}
}
