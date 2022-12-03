package Week8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {

	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("Adam", "Bob", "Carlo", "Dave", "Eve", "Fransis", "Geroge", "Helen", "Ann", "Chris", "David", "Deniel");
		
//		data.stream().sorted().forEach(System.out::println);
		
//		data.stream().mapToInt(x ->x.length()).forEach(System.out::println);
		
		data.stream().collect(Collectors.groupingBy(
				name -> name.charAt(0))).forEach((ch, name)-> System.out.println(ch + ": "+ name));

	}

}
