// 乘法表
public class MultiplicationTable {
	public static void main(String[] args){
		for(int line = 1; line <= 9; line++){
			for(int i = 1; i <= line; i++ ){ // 表示第一个乘数
				System.out.print(i + "*" + line + "=" + (i * line) + "\t"); //“\t”保证了对齐,\t 的作用是跳到下一个制表位
			}
			System.out.println();//换行
		}
	}
}
