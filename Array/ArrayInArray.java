// 二维数组遍历
public class ArrayInArray {
	public static void main(String[] args){
		int[][] array1 = new int[][]{
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		System.out.println(array1.length);
		
		// 遍历二维数组
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
			for(int j = 0; j < array1[i].length; j++)
				System.out.println(array1[i][j]);
		}
	}
}
