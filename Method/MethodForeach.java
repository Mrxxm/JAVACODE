// 增强for循环
public class MethodForeach {
	public static void main(String[] args){
		int[] array1 = new int[]{1,2,3,4,5,6};
		int[][] array2 = new int[][]{
			{11,12},
			{15},
			{18,19},
			{20}
		};
		// foreach方法
		for(int ele : array1){ // 数组类型 数组元素 数组名
			System.out.println(ele);
		}
		// foreach方法
		for(int[] ele1 : array2){
			System.out.println(ele1);
			for(int ele2 : ele1){
				System.out.println(ele2);
			}
		}
		// for方法
		for(int i = 0; i < array2.length; i++){
			System.out.println(array2[i]);
			for(int j = 0; j < array2[i].length; j++)
				System.out.println(array2[i][j]);
		}
		
	}
}
