import java.math.BigDecimal;

public class BigDecimalDemo1 {
	public static void main(String[] args) {
		// 使用double
		System.out.println("0.09 + 0.01 =" + (0.09 + 0.01) );
		/**
		 * 0.09 + 0.01 =0.09999999999999999
		 */
		System.out.println("12.3 / 100 =" + (12.3 / 100) );
		/**
		 * 12.3 / 100 =0.12300000000000001
		 */
		// 使用BigDecimal(double val)
		BigDecimal num1 = new BigDecimal(0.01);
		BigDecimal num2 = new BigDecimal(0.09);
		System.out.println(num1.add(num2));
		/**
		 * 0.09999999999999999687749774324174723005853593349456787109375
		 */
		// 使用BigDecimal(String val)
		BigDecimal num3 = new BigDecimal("0.01");
		BigDecimal num4 = new BigDecimal("0.09");
		System.out.println(num3.add(num4));
		/**
		 * 0.10
		 */
	}
}
