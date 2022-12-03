package Week9;

import java.util.Arrays;
import java.util.stream.Stream;


public class Ex6 {

	public static void main(String[] args) {
		int [][][] numbers = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9,10}
				},
				{
					{1,2,3},
					{4,5,6},
					{7,8,9,10}
				}
		};
		
		System.out.println("The total = " +
		Stream.of(numbers).flatMap(Arrays::stream)
							.flatMapToInt(x-> Arrays.stream(x)).peek(System.out::println).sum());

	}

}
