public class ObjectDemo {
	public static void main(String[] args) {
		User user = new User("Tom",22);
		System.out.println(user);
		/**
		 * 没有重写父类的toString方法打印结果
		 * objectMethod.User@c2e1f26
		 * 
		 * 重新父类的toString方法打印结果
		 * Tom,22
		 */
	}
}

class User{
	private String name;
	private int age;
	
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return this.name + "," + this.age;
	}
}