package Week2;

public class IndexOutOfBoundEx {

	public static void main(String[] args) {
		int [] data = {1,2,3};
		try {
			
			for(int i=0; i<=3; i++)
				System.out.println(data[i]);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Continue to here");
	}

}
