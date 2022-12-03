package Week3;

class InvalidRadiusException extends Exception{
	//double radius;
	
	public InvalidRadiusException(double radius) {
		super("Invalid radius " + radius );
		//this.radius = radius;
	}
}

class MyCircle{
	double radius;
	
	MyCircle(double radius) throws InvalidRadiusException{
		setRadius(radius);
	}
	
	void setRadius(double radius) throws InvalidRadiusException{
		if(radius >0)
			this.radius = radius;
		else 
			throw new InvalidRadiusException(radius);
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			new MyCircle(0);
		} catch (InvalidRadiusException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Continue to here");
		}
	}

}
