public class instanceofdemo {
	public static void main(String[] args) {
		Object obj = "编译类型"; // 把String对象赋值给Object类型
		System.out.println(obj instanceof Object); // true
		System.out.println(obj instanceof String); // true
		
		// 比较对象真实类型
		System.out.println(obj.getClass()); // 获取对象真实类型
		System.out.println(obj.getClass() == Object.class); // false
		System.out.println(obj.getClass() == String.class); // true
	}
}
