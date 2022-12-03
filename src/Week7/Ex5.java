package Week7;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pear");
		
		fruits.forEach(x -> System.out.println(x));
	}

}
