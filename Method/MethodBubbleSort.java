// 冒泡排序
public class MethodBubbleSort {
	public static void main(String[] args){
		int[] array1 = new int[]{4,2,6,7,5,3};
		MethodBubbleSort.print(array1);
		MethodBubbleSort.sort(array1);
		MethodBubbleSort.print(array1);
	}
	
	// 要交换length - 1次
	static int[] sort(int[] arr){
		/*
		// 第一次交换得出最大的数排在数组末尾
		for(int i = 1; i <= arr.length - 1; i++){
			if(arr[i -1] > arr[i]){
				swap(arr, i - 1 , i);
			}
		}
		// 第二次
		for(int i = 1; i <= arr.length - 2; i++){
			if(arr[i - 1] > arr[i]){
				swap(arr, i - 1, i);
			}
		}
		// 第三次
		for(int i = 1; i <= arr.length - 3; i++){
			if(arr[i - 1] > arr[i]){
				swap(arr,i - 1, i);
			}
		}
		// 第四次
		for(int i = 1; i <= arr.length - 4; i++){
			if(arr[i - 1] > arr[i]){
				swap(arr,i - 1, i);
			}
		}
		// 第五次
		for(int i = 1; i <= arr.length - 5; i++){
			if(arr[i - 1] > arr[i]){
				swap(arr,i - 1, i);
			}
		}
		return arr;
		*/
		
		// 整合规律
		for(int i = 1; i <= arr.length - 1; i++){
			for(int j = 1; j <= arr.length - i; j++){
				if(arr[j - 1] > arr[j]){
					swap(arr,j - 1, j);
				}
			}
		}
		return arr;	
	}
	
	
	static void swap(int[] arr, int index1, int index2){
		int temp = 0;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
