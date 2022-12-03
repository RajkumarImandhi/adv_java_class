package Week2;

enum Level {
	LOW, MEDIUM, HIGH;
	
	Level() {
		System.out.println("Constructor called for: "+ this.toString());
	}
}

public class EnumEx1 {

	public static void main(String[] args) {
		for(Level x: Level.values())
			System.out.println(x+ " at index "+ x.ordinal());
		
		Level val = Level.MEDIUM;
		switch (val) {
		case LOW: 
			System.out.println("its LOW");
			break;
			
		case MEDIUM:
			System.out.println("its MEDIUM");
			break;
			
		case HIGH:
			System.out.println("its HIGH");
			break;
			
		default:
			System.out.println("Opps...");
	}

}
}
