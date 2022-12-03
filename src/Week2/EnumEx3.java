package Week2;

enum PayrollDay{
	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY), 
	SATURDAY(PayType.WEEKEND), 
	SUNDAY(PayType.WEEKEND);
	
	PayType payType;
	private PayrollDay(PayType payType) {
		this.payType = payType;
	}
	int pay(int misWorked, int payRate) {
		return payType.pay(misWorked, payRate);
	}

	enum PayType{
		WEEKDAY{
			int overtimePay(int minsWorked, int payRate) {
					return minsWorked <= MIN_PER_SHIFT ? 0: (minsWorked-MIN_PER_SHIFT)*payRate/2;
				}
		},
		WEEKEND{
			int overtimePay(int minsWorked, int payRate) {
					return minsWorked * payRate/2;
				}
		};
	
		static final int MIN_PER_SHIFT = 8 * 60;
		abstract int overtimePay(int minsWorked, int payRate);
	
		int pay(int minsWorked, int payRate) {
		
			int basePay = minsWorked * payRate;
			return basePay + overtimePay(minsWorked, payRate);
		}
	}
}

public class EnumEx3 {
	

	public static void main(String[] args) {
		
		for(PayrollDay day : PayrollDay.values())
			System.out.printf("%-10s%d\n", day, day.pay(8*60,1));
	}

}
