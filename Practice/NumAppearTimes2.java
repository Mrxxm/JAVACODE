// 三位数位数次数统计2
public class NumAppearTimes2{
	public static void main(String[] args){
		int[] total = new int[10];         // 动态初始化一个空间为10大小的数组，存储0~9出现的次数。
		int n;	                           // n代表各个位数上的数值。
		for(int i = 0; i < 100; i++){
			int temp = (int) (899 * Math.random() + 100); // 随机生成一个百位数100 ~ 999之间
			while(temp > 0){
			n = temp % 10;
			total[n]++;
			temp = temp / 10;
			}
		}
		for(int j = 0; j < total.length; j++){ // 打印
			System.out.println(j + " " + total[j]);
		}
	}
}