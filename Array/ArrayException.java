// 数组常见两种异常
public class ArrayException {
	public static void main(String[] args){
		int[] array1 = new int[5];
		
		/* 数组空指针异常:NullPointerException
		array1 = null;
		System.out.println(array1.length);
		*/
		
		/* 数组越界异常:ArrayIdexOutOfBoundException
		for(int i = 0; i <= array1.length; i++){
			array1[i] = 2;
		}
		*/	
	}
}
