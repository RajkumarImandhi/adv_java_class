package Week7;

import java.util.stream.Stream;

public class Ex9 {

	public static void main(String[] args) {
		
		Stream.of("Hello", "Raj", "kumar").forEach(
				x -> System.out.println(x)
				);
		System.out.println("-------");
		Stream.of("Hello", "Raj", "kumar").parallel().forEach(
				x -> System.out.println(x)
				);
	}
}
