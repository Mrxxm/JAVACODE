// 函数递归
public class MethodRecursion {
	public static void main(String[] args){
		int ret = fn(4);
		System.out.println(ret);
		
	}
	
	static int fn(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{// n不等于0和1
			return fn(n - 1) + fn(n - 2);
		}
	}
}

