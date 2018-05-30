// 数组可变参数求和
public class ArrayVarArgsGetSum {
	public static void main(String[] args){
		int[] array1 = new int[]{1,2,3,4,5,6,7,8,9};
		int SUM1 = ArrayVarArgsGetSum.getSum(array1);
		System.out.println("array1 of sum:" + SUM1);
		
		int SUM2 = ArrayVarArgsGetSum.getsum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("VarArgs of sum:" + SUM2);
	}
	
	static int getSum(int[] arr){
		int sum = 0;
		for(int ele : arr){
			sum = sum + ele;
		}
		return sum;
	}
	
	// 可变参数使用
	static int getsum(int ... array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return sum;
	}
	
	
}
