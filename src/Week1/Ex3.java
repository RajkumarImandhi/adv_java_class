package Week1;

interface CarFullService{
	void runCarService();
}

class CarAFullService implements CarFullService{
	public void runCarService() {
		System.out.println("Run car A service");
	}
}

class CarBFullService implements CarFullService{
	public void runCarService() {
		System.out.println("Run car B service");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		CarAFullService car = new CarAFullService();
		car.runCarService();

	}

}
