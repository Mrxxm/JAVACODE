// 数组获取最大最小值
public class ArrayGetMax {
	public static void main(String[] args){
		int[] array1 = new int[]{1,54,1000,3,7,8,-14};
		System.out.println(array1.length);
		int Max = ArrayGetMax.getMax(array1);
		System.out.println(Max);
		int Min = ArrayGetMax.getMin(array1);
		System.out.println(Min);
	}
	
	static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	static int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
