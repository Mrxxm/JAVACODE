// 数组复制
public class ArrayCopy {
	public static void main(String[] args){
		int[] srcArray = new int[]{5,2,1};
		int[] destArray = new int[srcArray.length];
		ArrayCopy.print(destArray);
		ArrayCopy.copy(srcArray,0,destArray,0,srcArray.length);
		ArrayCopy.print(destArray);
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
	
	// 数组复制
	static int[] copy(int[] sArr, int s, int[] dArr, int d, int l){
		for(int i = 0; i < l; i++){
			dArr[d + i] = sArr[s + i];
		}
		return dArr;
	}
}
