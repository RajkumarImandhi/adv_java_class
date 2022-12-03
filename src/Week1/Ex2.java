package Week1;

abstract class CarService{
	
	void runService() {
		System.out.println("Run Service...");
	}
	abstract void prepareService();
	
	void service() {
		prepareService();
		runService();
	}
}
class CarAService extends CarService{
	void prepareService() {
		System.out.println("A service....");
	}
}

class CarBService extends CarService{
	void prepareService() {
		System.out.println("B service....");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		CarService car = new CarAService();
		car.service();

	}

}
