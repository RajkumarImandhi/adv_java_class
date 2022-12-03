package Week7;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(4, "H");
		hmap.put(10, "M");
		hmap.put(8, "A");
		hmap.put(16, "P");
		
		//hmap.forEach((key, Value)-> System.out.println("Key: " + key + " Value: " + Value));
		hmap.forEach((key, value) -> {
			if(key >=10)
				System.out.println(value);
		});
		System.out.println("_______");
		hmap.forEach((key, value) -> {
			if("P".equals(value))
				System.out.println("Key = " + key);
		});
	}

}
