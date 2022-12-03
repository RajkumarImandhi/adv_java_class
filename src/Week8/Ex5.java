package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		
		List<String> depts = Arrays.asList(
				"Marketing", "Mathematics", "Chemistry", "Mathematics", "Physics", "Marketing", "Physics", "Marketing", "Business", "Business");
		
//		Map<String, Long> returnValue = depts.stream().collect(Collectors.groupingBy(dept -> dept, Collectors.counting()));
//		
//		returnValue.forEach((key, value) -> System.out.println(key + ": " + value));
		
		depts.stream().collect(Collectors.groupingBy(
				dept -> dept,
				Collectors.counting())).forEach((dept, count)-> System.out.println(dept + ": " + count));
		 
	}

}
