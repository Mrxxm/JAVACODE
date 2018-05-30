public class enumeration {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setrestday(Weekday.SUNDAY);
		System.out.println(e.getRestday());
	}
}
//class Weekday{
//	private Weekday(){};
//	public static final Weekday MONDAY = new Weekday();
//	public static final Weekday TUESDAY = new Weekday();
//	public static final Weekday WEDNESDAY = new Weekday();
//	public static final Weekday TURSDAY = new Weekday();
//	public static final Weekday FRIDAY = new Weekday();
//	public static final Weekday SATURDAY = new Weekday();
//	public static final Weekday SUNDAY = new Weekday();
//}

enum Weekday{
	MONDAY,TUESDAY,WEDNESDAY,TURSDAY,FRIDAY,SATURDAY,SUNDAY;
}


class Employee{
	private Weekday restday;
	public Weekday getRestday(){
		return restday;
	}
	public void setrestday(Weekday rest){
		restday = rest;
	}
}
