// 数组逆序排列
public class ArrayReverse {
	public static void main(String[] args){
		int[] array1 = new int[]{9,8,7,6,5,4,3,2,1,0};
		System.out.println(array1.length);
		ArrayReverse.print(reverse(array1));
	}
	
	static int[] reverse(int[] arr){ // 可以返回类型为一个数组int[]
		int[] array2 = new int[arr.length];
		for(int i = arr.length - 1; i >= 0; i--){ // 数组索引与数组长度要十分注意，容易引起索引越界异常
			// 0 9
			// 1 8
			// 2 7
			array2[arr.length - 1 - i] = arr[i];
		}
		return array2;
	}
	
	static void print(int[] arr){
		String ret = "[";
		for(int i = 0; i < arr.length; i++){
			ret = ret + arr[i];
			
			if(i != arr.length - 1){
				ret = ret + ",";
			}
		}
		ret = ret + "]";
		System.out.println(ret);
	}
}
