// 数组中的equals方法 toString方法 sort方法 arraycopy方法
import java.util.Arrays;
public class ArrayMethod{
	public static void main(String[] args) {
		int[] score1 = {11, 33, 22, 44};     // 静态初始化数组
		int[] score2 = {11, 33, 22, 44};

		// equals方法
		System.out.println(score1.equals(score2));			// 比较的是内存地址
		System.out.println(Arrays.equals(score1, score2));  // 比较的是数组内容
		
		// sort方法
		Arrays.sort(score1);								// 升序排列
		for(int i : score1){
			System.out.println(i);
		}

		// toString方法
		System.out.println(score1.toString());              // 打印数组地址hascode值
		System.out.println(Arrays.toString(score1));        // 按格式打印数组的内容
		
		// arraycopy方法
		int[] score = new int[10];							// 动态创建数组score
		System.out.println(Arrays.toString(score)); 		// 调用Arrays的toString方法打印数组
		System.arraycopy(score1, 0, score, 4, 2);			// 源数组 开始位置 目标数组 开始位置 拷贝长度
		System.out.println(Arrays.toString(score));			// 打印
	}
}