package Week1;

class car{
	void buildEngine() {
		System.out.println("4 Engine...");
	}
}

class CarDoor extends car{
	void build() {
		System.out.println("2 door....");
		buildEngine();
	}
}

public class Ex1 {
	
	public static void main(String[] args) {
		CarDoor car = new CarDoor();
		car.build();
	}
}
