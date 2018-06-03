public class enumerationFourth {
	public static void main(String[] args) {
		switch(number.two){
			case one:
			break;
			case two:
				System.out.println("two:" + number.two.ordinal());
			break;
			case three:
			break;
			case four:
			break;
			case five:
			break;
		}
	}
}

enum number{
	one , two , three ,four , five;
}
