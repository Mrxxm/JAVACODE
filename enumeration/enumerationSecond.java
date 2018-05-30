public class enumerationSecond {
	public static void main(String[] args) {
		// name方法
		String name = Month.January.name();
		System.out.println(name);
		/**
		 * January
		 */
		// ordinal方法
		int ordinal = Month.April.ordinal();
		System.out.println(ordinal);
		/**
		 * 3
		 */
		// toString方法
		String str = Month.August.toString();
		System.out.println(str);
		/**
		 * August
		 */
	}
}

enum Month{
	January,February,March,April,May,June,July,August,September,October,November,December; 
}