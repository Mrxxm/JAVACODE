// 静态代码块

public class CodeBloakDemo2 {
	{
		System.out.println("初始化代码块");
	}
	CodeBloakDemo2(){
		System.out.println("构造器");
	}
	static{
		System.out.println("静态代码块");
	}
	public static void main(String[] args) {
		new CodeBloakDemo2();
		/**
		 * 静态代码块
		 * 初始化代码块
		 * 构造器
		 */
		new CodeBloakDemo2();
		/**
		 * 初始化代码块
		 * 构造器
		 */
	}
}
