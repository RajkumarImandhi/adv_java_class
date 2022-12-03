package Week2;

public class DivideByZeroException {

	public static void main(String[] args) {
		try {
            int number[] = new int[10];
            number[10] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Index out of size of the array");
        }

	}

}
