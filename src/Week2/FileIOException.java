package Week2;

import java.io.FileReader;
import java.io.IOException;

public class FileIOException {

	public static void main(String[] args) {
		try {
			FileReader fp = new FileReader("abc.txt");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Continue to here");
		}

	}

}
