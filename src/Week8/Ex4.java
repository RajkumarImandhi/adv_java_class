package Week8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Ex4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		
		//numbers.stream().skip(6).forEach(System.out::println); //no.of elements to skip from starting 
		//numbers.stream().filter(i -> i%2 == 0).distinct().forEach(System.out::println);

		//numbers.stream().sorted().forEach(System.out::println);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
