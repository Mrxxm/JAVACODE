// int类型数组String类型数组打印（函数重载）
public class ArrayPrint {
	public static void main(String[] args){
		int[] array1 = new int[]{1,2,3,4,5};
		String[] array2 = new String[]{"A","B","C","D","E"};
		ArrayPrint.print(array1);
		ArrayPrint.print(array2);// 函数重载
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
	
	static void print(String[] arr){
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
