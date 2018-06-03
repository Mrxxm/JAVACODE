public class enumerationThird {
	public static void main(String[] args) {
		word[] w = word.values();  // 返回当前枚举类型的所有常量，使用一个数组封装起来
		for(word wo : w){
			System.out.print(wo);
		}
		/**
		 * ABCDEFG
		 */
		word a = word.valueOf("A");// 把一个指定名称字符串转换为当前枚举类中的同名的常量
		System.out.println(a);
		/**
		 * A
		 */
	}
}
enum word{
	A,B,C,D,E,F,G;
}
