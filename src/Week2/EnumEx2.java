package Week2;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumEx2 {
	
	private enum WeekDay{
		MONDAY,	TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	private static boolean isWorkingDay(Set<WeekDay> daySet, WeekDay day) {
		return daySet.contains(day);
	}

	public static void main(String[] args) {
		
		EnumSet<WeekDay> weekDaySet = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		EnumSet<WeekDay> weekEndSet = EnumSet.complementOf(weekDaySet);
		
		Iterator<WeekDay> itr = weekEndSet.iterator();
		while(itr.hasNext())
			System.out.println("Day: "+ itr.next());
		
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.MONDAY));
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.SUNDAY));
	}

}
