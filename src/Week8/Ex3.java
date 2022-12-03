package Week8;

import java.util.ArrayList;
import java.util.List;


public class Ex3 {

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		
		data.add("AAAAAAA");
		data.add("BBB");
		data.add("CCCCC");
		data.add("DDDDDDDDD");
		
		data.stream().filter(str -> str.length() < 6).forEach(System.out::println);
		long x = data.stream().filter(str -> str.length() < 6).count();
		System.out.println(x);
//		int count=0;
//		data.forEach(y -> {
//			if(y.length() >6)
//				count++;
//				System.out.println(y);
//		});
	}

}
