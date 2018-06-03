// 数值交换
public class SwapMethod {
	public static void main(String[] args){
		int a = 5;
		int b = 6;
		System.out.println("a=" + a + " " + "b=" + b);
		
		SwapMethod.swap1(a, b);
		
		SwapMethod.swap2(a, b);
		
	}
	
	static void swap1(int a, int b){
		a = b - a;
		b = b - a;
		a = b + a;
		System.out.println("a=" + a + " " + "b=" + b);
	}
	
	static void swap2(int a, int b){
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a=" + a + " " + "b=" + b);
	}
}	
