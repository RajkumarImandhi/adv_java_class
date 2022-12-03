package Week7;

import java.util.HashMap;

public class Ex6 {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		hMap.put("New York City", 8400000);
		hMap.put("Houston", 2200000);
		hMap.put("Los Angels", 3900000);
		hMap.put("Chicago", 2700000);
		hMap.put("Denver", 640000);
		hMap.put("Kansas City", 460000);
		
		hMap.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
