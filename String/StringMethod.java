// 字符串方法练习
import java.util.Arrays;
public class StringMethod{
	public static void main(String[] args) {
		String string1 = "hello java";
		String string2 = "HELLO JAVA";
		String string3 = new String("hello java");
		// hashcode方法
		System.out.println(string1.hashCode());                 // 打印hashcode值
		System.out.println(string2.hashCode());					// 1,3的值相同,内容相同则其值就相同，区分大小写
		System.out.println(string3.hashCode());					// 校验码，值相同，则校验码相同
		/**
		 * -1605094224
		 * -1090449200
		 * -1605094224
		 */
		
		// concat方法
		System.out.println(string1.concat(string2));        	  // 连接两个字符串不改变字符串内容
		/**
		 * hello javaHELLO JAVA
		 */
		
		// equals、equalsIgnoreCase方法
		System.out.println(string1.equals(string3));        	  // 比较字符串内容
		System.out.println(string1.equalsIgnoreCase(string2));    // 忽略大小写比较字符串内容
		/**
		 * true
		 * true
		 */
		
		// length()方法
        System.out.println(string1.length() );                   // 字符串方法
        /**
         * 10
         */
       
       // charAt方法
       System.out.println(string1.charAt(0) ); 				     // 查找字符串中的数值，范围0 ~（length-1）
       /**
        * h
        */
       
       // startsWith方法
       System.out.println(string1.startsWith("h") );           // 返回true,查找字符串中是否存在字符，区分大小写
       /**
        * true
        */
       
       // toUpperCase方法
       System.out.println( string3.toUpperCase());             // 全大写,toLower,不改变值
       /**
        * HELLO JAVA
        */
       
       // trim方法
       String string5 = " hello java ";
       System.out.println( "Before trim：" + string5.length() );
       string5 = string5.trim();                           	// 只去除字符串首尾的空格不去除中间空格，改变值；
       System.out.println( "After trim：" + string5.length() );
       /**
        * Before trim：12
		*  After trim：10
        */
       
       // split方法
       String[] s7 = new String[10];
       String string6 = "H E L L O";
       s7 = string6.split( " " );                     		    // 根据分隔符，把字符串分成一个字符数组
       System.out.println( s7.length );
       System.out.println(Arrays.toString(s7)); 				// 打印数组
       /**
        * 5
		*  [H, E, L, L, O]
        */
       
       // replace方法、replaceFirst方法
       String s8 = string1.replace('l', 'a');					// 替代字符串中所有l->a,不改变源字符串值
       System.out.println(s8);
       String s9 = string1.replaceFirst( "l", "L");     		// 替代字符串中第一个字符
       System.out.println(s9);
       /**
        * heaao java
        * heLlo java
        */
       
       // substring()、substring( ，)方法
       String s10 = string1.substring( 8 );               		// 从下标为8的字符开始陆续输出打印
       System.out.println(s10);
       String s11 = string1.substring( 6, 7);              	// 包含起点8，不包含终点11,输出到10
       System.out.println(s11);								// 防止字符串数值越界异常
       /**
        * va
		*  j
        */
       
       // indexOf、lastIndexOf方法
       int o1 = string1.indexOf( 'o' );                        // 可以找字符或字符串
       System.out.println( o1 );          						// 查找失败则返回-1
       int o2 = string1.indexOf( 'o', 6);                      // 从第6个字符开始查找字符‘o’
       System.out.println( o2 );
       int o3 = string1.indexOf("llo", 1);						// 从第1个字符开始查找字符串“llo”
       System.out.println( o3 );
       int o4 = string1.lastIndexOf( 'o' );                    // 从字符串的左边开始找
       System.out.println( o4 );
       /**
        * 4
		* -1
        * -1
        * 4
        */
	}
}