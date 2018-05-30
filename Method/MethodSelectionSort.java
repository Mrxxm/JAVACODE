// 选择排序
public class MethodSelectionSort {
	public static void main(String[] args){
		int[] array1 = new int[]{4,2,1,6,7,5,3};
		MethodSelectionSort.print(array1);
		MethodSelectionSort.select(array1);
		MethodSelectionSort.print(array1);
	}
	
	static void select(int[] arr){
		/*
		// 1
		for(int i = 1; i <= arr.length - 1; i++){
			if(arr[0] > arr[i]){
				swap(arr, 0 , i);
			}
		}
		// 2
		for(int i = 2; i <= arr.length - 1; i++){
			if(arr[1] > arr[i]){
				swap(arr, 1, i);
			}
		}
		*/
		
		// 规律 注意点：比较次数是length - 1；选择排序是将最小值放在首位；
		for(int i = 1; i <= arr.length - 1; i++){
			for(int j = i; j <= arr.length - 1; j++){
				if(arr[i-1] > arr[j]){ // 注意点：这个循环中的arr[i - 1]，不是arr[j - 1];特别注意。
					swap(arr, i-1, j);
				}
			}
		}
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
	
	static void swap(int[] arr, int index1, int index2){
		int temp = 0;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
