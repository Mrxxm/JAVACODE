// 初始化代码块
/**
 * 
 * @author tom
 * 每次创建对象时都会调用构造器，在调用构造器之前，会先执行本类中的初始化代码块
 */

public class CodeBloakDemo1 {
	{
		System.out.println("初始化代码块");
	}
	
	CodeBloakDemo1(){
		System.out.println("构造器");
	}
	public static void main(String[] args) {
		new CodeBloakDemo1();
		/**
		 * 初始化代码块
		 * 构造器
		 */
		new CodeBloakDemo1();
		/**
		 * 初始化代码块
		 * 构造器
		 */
		
	}
}
