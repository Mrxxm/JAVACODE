// 数组遍历
public class ArrayTraverse {
	public static void main(String[] args){
		int[] array1 = new int[]{1,13,24,90,4,8,17};
		System.out.println(array1.length);
		ArrayTraverse.arrayTraverse(array1);
	}
	static void arrayTraverse(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
