// 位值求和
import java.util.*;
public class SumPlaceValue{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个五位数:");
		int a;
		int sum = 0;
		a = in.nextInt();
		
		while(a > 0){
			int t = a % 10;
			sum += t;
			a = a/10;
		}
		System.out.println("五位数各个位数相加的值为:" + sum);
	}	
}