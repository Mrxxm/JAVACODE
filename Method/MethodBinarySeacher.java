// 二分搜索法:前提--数组必须是有序的
public class MethodBinarySeacher {
	public static void main(String[] args){
		int[] array1 = new int[]{1,2,3,9,8,7,4,5,6};
		MethodBinarySeacher.bubbleSort(array1);
		MethodBinarySeacher.print(array1);
		
		int index = MethodBinarySeacher.binarySeacher(array1, 0);
		System.out.println(index);
	}
	
	static int binarySeacher(int[] arr, int key){
		int low = 0;//索引
		int high = arr.length - 1; //索引
		while(low <= high){ // 等号很关键，就是程序的最后出口
			int mid = (low + high) / 2;
			int midVal = arr[mid];
			if(midVal < key){// 猜小
				low = mid + 1;
			}else if(midVal > key){// 猜大
				high = mid - 1;
			}else{
				return mid;
			}	
		}
		return -1;
	}
	
	static void bubbleSort(int[] arr){
		for(int i = 1; i <= arr.length - 1; i++){
			for(int j = i; j <= arr.length - i; j++){
				if(arr[j - 1] > arr[j]){
					swap(arr, j - 1, j);
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
	
	static void swap(int[] arr, int i, int j){
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
