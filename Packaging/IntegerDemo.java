public class IntegerDemo {
	public static void main(String[] args) {
		// 1
		// 装箱
		// 方式一
		Integer num1 = new Integer(90);
		// 方式二
		Integer num2 = Integer.valueOf(90);
		
		// 拆箱
		int num3 = num1.intValue();
		
		System.out.println(num1); // Integer覆盖了Object类中的toString方法
		System.out.println(num2); // 所以num1，num2打印出来不是hasCode值
		System.out.println(num3);
		
		// 2
		// 自动装箱
		Integer num4 = 17; // 底层：Integer.valueOf(17);
		
		// 自动拆箱
		int num5 = num4;
		
		// 3
		// switch中也支持包装类
		Integer num6 = 2;
		switch(num6){
		case 1 : 
			break;
		case 2 : System.out.println(num6);
			break;
		}
		
		// 4
		// 解释
		Object ob = 17;
		/**
		 * Integer i = 17 自动装箱
		 * Object ob = i  自动类型转换
		 */
		System.out.println(ob);
		/**
		 * 17
		 */
	}
}
