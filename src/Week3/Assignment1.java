package Week3;

enum Month {
	 JAN("31"), FEB("28"), MAR("31"), APR("30"), MAY("31"), JUN("30"), JUL("21"), AUG("31"), SEP("30"), OCT("31"), NOV("30"), DEC("31");
	 private String days;
	
	public String getDays() {
		 return this.days;
	 }
	 Month(String days) {
		 this.days = days;
	}
	}

public class Assignment1 {
	
	public static void main(String[] args) {
		getDaysOfYear(Month.MAR, 15);
		getDaysOfYear(Month.DEC, 31);
		getDaysOfYear(Month.FEB, 30);
		getDaysOfYear(Month.JUN, 31);
		getDaysOfYear(Month.JAN, 0);
		}
	static void print31(Month mon, int i, int total) {
		
		if(i <=31 && i >=1)
			System.out.println("Total Days = " + total);
		else 
			System.out.println(i +" of " + mon + " is an invalid date ");
	}
	static void print30(Month mon, int i, int total) {
		
		if(i <=30 && i >=1)
			System.out.println("Total Days = " + total);
		else 
			System.out.println(i +" of " + mon + " is an invalid date ");
	}
	static void print28(Month mon, int i, int total) {
		
		if(i <=28 && i >=1)
			System.out.println("Total Days = " + total);
		else 
			System.out.println(i +" of " + mon + " is an invalid date ");
	}
	private static void getDaysOfYear(Month mon, int i) {
		int total =i;
		Month[] months = Month.values();
		for (Month mons: months) {
			if(mon.toString() == mons.name()) 
				total = total + Integer.parseInt(mons.getDays());
			else
				break;
		}
		
		switch (mon) {
		case JAN: 
			print31(Month.JAN, i, total);
			break;
			
		case FEB: 
			total =total + 35 ;
			print28(Month.FEB, i, total);
			break;
		case MAR: 
			total =total + 59 ;
			print31(Month.MAR, i, total);
			break;
		case APR: 
			total =total + 90 ;
			print30(Month.APR, i, total);
			break;
		case MAY: 
			total =total + 120 ;
			print31(Month.MAY, i, total);
			break;
		case JUN: 
			total =total + 151 ;
			print30(Month.JUN, i, total);
			break;
		case JUL: 
			total =total + 181 ;
			print31(Month.JUL, i, total);
			break;
		case AUG: 
			total =total + 212 ;
			print31(Month.AUG, i, total);
			break;
		case SEP: 
			total =total + 243 ;
			print30(Month.SEP, i, total);
			break;
		case OCT: 
			total =total + 273 ;
			print31(Month.OCT, i, total);
			break;
		case NOV: 
			total =total + 304 ;
			print30(Month.NOV, i, total);
			break;
		case DEC: 
			total =total + 334 ;
			print31(Month.DEC, i, total);
			break;
		default:
			System.out.println(mon + " is an invalid");
		}
		
	}
}

