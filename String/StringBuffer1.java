// StringBuffer
public class StringBuffer1{
	public static void main(String[] args) {
		StringBuffer stringB = new StringBuffer();
		System.out.println(stringB.toString()); 
		/**
		 * 
		 */
		
		// append方法
		stringB.append("hello");
		System.out.println(stringB.toString());
		/**
		 * hello
		 */
		stringB.append(" ").append("java");
		System.out.println(stringB.toString());
		/**
		 * hello java
		 */
		
		// delete方法
		stringB.delete(5, 10);                    	// 包含起点，不包含终点
       System.out.println( stringB.toString() );
       /**
        * hello
        */
       
       // insert方法
       stringB.insert(5,"MM");             	    // 插入的字符串是从第3个位置开始的
       System.out.println( stringB.toString() );
       /**
        * helloMM
        */
       
       // replace方法
       stringB.replace(5, 6," ");             		// 包含起始，不包含终点，替换
       System.out.println( stringB.toString() );
       /**
        * hello M
        */
	}
}