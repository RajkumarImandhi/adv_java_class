package Week2;

public class NullPointerException {

	public static void main(String[] args) {
		String ptr = null;
		try {
			//if(ptr.equals("abcde"))
			if("abcde".equals(ptr))
				System.out.println("They are same");
			else 
				System.out.println("They are not same");
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Continue to here");
		}

	}

}
