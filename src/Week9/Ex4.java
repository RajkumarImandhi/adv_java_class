package Week9;

import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		String[][]  array = new String[][] {
			{"a", "b"}, {"c", "d"}, { "e", "f"}};
			
		String[] ret = Stream.of(array).flatMap(Stream::of).toArray(String[]::new);

		for(String s: ret)
			System.out.println(s);
	}

}
