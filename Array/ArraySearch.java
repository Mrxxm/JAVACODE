// 数组中元素第一次和最后一次索引出现查找
public class ArraySearch {
	public static void main(String[] args){
		int[] array1 = new int[]{0,999,67,89,8,9,999,20,89,6,-1,999,9};

		int I1 = ArraySearch.indexOf(array1,999);
		System.out.println(I1);
		int I2 = ArraySearch.lastIndexOf(array1,999);
		System.out.println(I2);
	}
	
	static int indexOf(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				return i;
			}
		}
		return -1;
	}
	
	static int lastIndexOf(int[] arr, int n){
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] == n){
				return i;
			}
		}
		return -1;
	}
}
