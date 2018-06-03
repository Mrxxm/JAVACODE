/**
 * 
 * @author tom
 *
 * String --> 包装类对象(两种)          包装类对象 --> String 
 * Integer.valueOf("123");		   	   i3.toString();
 *
 * String --> 基本数据类型			   基本数据类型 --> String
 * Double.parseDouble(string);         String.valueOf(num2);
 * 
 * Number类
 * 包装类对象 --> 基本数据类型            基本数据类型 --> 包装类对象(两种)
 * i5.byteValue();                     Integer.valueOf(90);
 * 
 * 布尔：只认true、TRUE为真
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		// 1.把String类型数值转换为包装类,(String --> 包装类)
		// 方式一
		Integer i1 = Integer.valueOf("123");
		// 方式二
		Integer i2 = new Integer("123");
		System.out.println(i1 + i2);
		/**
		 * 246
		 */
		
		// 2.把包装类对象转化为String类型，(包装类 --> String)
		Integer i3 = Integer.valueOf(222);
		String str = i3.toString();
		System.out.println(str + 1);
		/**
		 * 2221
		 */
		
		// 3.把String转化为基本数据类型,拆箱(String --> 基本数据类型)
		String input = "12345";
		int i4 = Integer.parseInt(input);
		System.out.println(i4 + 1);
		/**
		 * 12346
		 */
		
		// 4.布尔
		Boolean bo = new Boolean("SB");
		System.out.println(bo); // 只认可true、TRUE为true；
		/**
		 * false 
		 */
		
		// 5.Number类,拆箱(包装类 --> 基本数据类型)
		Integer i5 = Integer.valueOf(17); // xxxValue把当前对象转化对xxx类型
		
		byte b = i5.byteValue(); 
		short s = i5.shortValue();
		int i = i5.intValue();
		long l = i5.longValue();
		float f = i5.floatValue();
		double d = i5.doubleValue();
		
		
		//    6.String --> 基本数据类型
		//  基本数据类型 --> String
		String string = "12345";
		double num1 = Double.parseDouble(string);
		
		double num2 = 12345;
		String S = String.valueOf(num2);
	}
}
